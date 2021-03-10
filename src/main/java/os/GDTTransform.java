package os;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static os.Utils.*;

class GDTTransform {
    private static final Integer BIT_SIZE = 32;

    public static void main(String[] args) {
        System.out.println(trans2GDT(0x0000ffff, 0x00cf9200));    // ok
        System.out.println(trans2GDT(0x7c0001ff, 0x00409800));    //
        System.out.println(trans2GDT(0x7c00fffe, 0x00cf9600));    //
        System.out.println(trans2GDT(0x80007fff, 0x0040920b));    //
        System.out.println("index == 1");
        System.out.println(trans2GDT(0x0000ffff, 0x00cf9200));    //
        System.out.println("index == 2");
        System.out.println(trans2GDT(0x7c0001ff, 0x00409800));    //
        System.out.println("index == 3");
        System.out.println(trans2GDT(0x7c00fffe, 0x00cf9600));    //
        System.out.println("index == 4");
        System.out.println(trans2GDT(0x80007fff, 0x0040920b));    //
        System.out.println(trans2GDT(0x8000ffff, 0x0040920b));    //
        System.out.println(trans2GDT(0x00007a00, 0x00409600));    //


        System.out.println("========");
        System.out.println(trans2GDTAttr(0x00409800));
        System.out.println(trans2GDTAttr(0x00409200));
        System.out.println(trans2GDTAttr(0x00409800));
        System.out.println(trans2GDTAttr(0x00c09600));
        System.out.println(trans2GDTAttr(0x0040f200));

        System.out.println("==============");
        List<Integer> list = Lists.newArrayList(1,1,0);
        System.out.println(getTypeDesc(list));
    }

    /**
     * @param x GDT的低 16位
     * @param y GDT的高 16位
     * @return
     */
    public static GDT trans2GDT(int x, int y) {
        List<Integer> low32 = toBinary(x,32);
        List<Integer> high32 = toBinary(y,32);
        Collections.reverse(low32);
        Collections.reverse(high32);
        List<Integer> segBase = new ArrayList<>();
        // 段基址
        segBase.addAll(low32.subList(16, 32));
        segBase.addAll(high32.subList(0,8));
        segBase.addAll(high32.subList(24, 32));
        Collections.reverse(segBase);

        // 段界限
        List<Integer> segBound = new ArrayList<>();
        segBound.addAll(low32.subList(0, 16));
        segBound.addAll(high32.subList(16, 20));
        Collections.reverse(segBound);

        // DPL
        List<Integer> DPL = new ArrayList<>();
        DPL.addAll(high32.subList(13, 15));
        Collections.reverse(DPL);

        // G
        List<Integer> G = new ArrayList<>();
        G.addAll(high32.subList(23,24));
        Collections.reverse(G);

        // DorB
        List<Integer> DorB = new ArrayList<>();
        DorB.addAll(high32.subList(22,23));
        Collections.reverse(DorB);

        // L
        List<Integer> L = new ArrayList<>();
        L.addAll(high32.subList(21,22));
        Collections.reverse(L);

        // AVL
        List<Integer> AVL = new ArrayList<>();
        AVL.addAll(high32.subList(20,21));
        Collections.reverse(AVL);

        // P
        List<Integer> P = new ArrayList<>();
        P.addAll(high32.subList(15,16));
        Collections.reverse(P);

        // S
        List<Integer> S = new ArrayList<>();
        S.addAll(high32.subList(12,13));
        Collections.reverse(S);

        // Type
        List<Integer> Type = new ArrayList<>();
        Type.addAll(high32.subList(8,12));
        Collections.reverse(Type);

        return GDT.builder()
                .segmentBase(binaryString2HexString(segBase))
                .segmentBound(binaryString2HexString(segBound))
                .DPL(binaryString2HexString(DPL))
                .G(binaryString2HexString(G))
                .DorB(binaryString2HexString(DorB))
                .L(binaryString2HexString(L))
                .AVL(binaryString2HexString(AVL))
                .P(binaryString2HexString(P))
                .S(binaryString2HexString(S))
                .TYPE(binaryString2Decimal(Type))
                .TYPE_DESC(getTypeDesc(Type))
                .build();
    }

    /**
     * 根据描述符的高16位输出 输出除段基址和界限之外的其他属性
     * @param y
     * @return
     */
    public static GDT trans2GDTAttr(int y) {
        List<Integer> high32 = toBinary(y,32);
        Collections.reverse(high32);

        // DPL
        List<Integer> DPL = new ArrayList<>();
        DPL.addAll(high32.subList(13, 15));
        Collections.reverse(DPL);

        // G
        List<Integer> G = new ArrayList<>();
        G.addAll(high32.subList(23,24));
        Collections.reverse(G);

        // DorB
        List<Integer> DorB = new ArrayList<>();
        DorB.addAll(high32.subList(22,23));
        Collections.reverse(DorB);

        // L
        List<Integer> L = new ArrayList<>();
        L.addAll(high32.subList(21,22));
        Collections.reverse(L);

        // AVL
        List<Integer> AVL = new ArrayList<>();
        AVL.addAll(high32.subList(20,21));
        Collections.reverse(AVL);

        // P
        List<Integer> P = new ArrayList<>();
        P.addAll(high32.subList(15,16));
        Collections.reverse(P);

        // S
        List<Integer> S = new ArrayList<>();
        S.addAll(high32.subList(12,13));
        Collections.reverse(S);

        // Type
        List<Integer> Type = new ArrayList<>();
        Type.addAll(high32.subList(8,12));
        Collections.reverse(Type);

        return GDT.builder()
                .DPL(binaryString2HexString(DPL))
                .G(binaryString2HexString(G))
                .DorB(binaryString2HexString(DorB))
                .L(binaryString2HexString(L))
                .AVL(binaryString2HexString(AVL))
                .P(binaryString2HexString(P))
                .S(binaryString2HexString(S))
                .TYPE(binaryString2Decimal(Type))
                .TYPE_DESC(getTypeDesc(Type))
                .build();
    }

    public static String getTypeDesc(List<Integer> type){
        int size = type.size();
        if(size < 4){
            for(int i = 0; i < 4 - size; i++){
                type.add(0,0);
            }
        }
        Integer first = type.get(0);
        Integer second = type.get(1);
        Integer third = type.get(2);
        List<Integer> newList = Lists.newArrayList(first,second,third);
        int value = binaryString2Decimal(newList);
        switch (value){
            case 0:
                return "数据 只读";
            case 1:
                return "数据 读 写";
            case 2:
                return "数据 只读 向下扩展";
            case 3:
                return "数据 读 写 向下扩展";
            case 4:
                return "代码 只执行";
            case 5:
                return "代码 执行 读";
            case 6:
                return "代码 只执行 依从的代码段";
            case 7:
                return "代码 执行 读 依从的代码段";
            default:
                return "null";
        }
    }





}
