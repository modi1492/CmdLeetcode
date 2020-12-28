package os;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class GDTTransform {
    private static final Integer BIT_SIZE = 32;

    public static void main(String[] args) {
        GDTTransform g = new GDTTransform();
        System.out.println(g.trans2GDT(0x0000ffff, 0x00cf9200));    // ok
        System.out.println(g.trans2GDT(0x7c0001ff, 0x00409800));    // nok
        System.out.println(g.trans2GDT(0x7c00fffe, 0x00cf9600));    // nok
        System.out.println(g.trans2GDT(0x80007fff, 0x0040920b));    // nok

    }

    /**
     * @param x GDT的低 16位
     * @param y GDT的高 16位
     * @return
     */
    private static GDT trans2GDT(int x, int y) {
        List<Integer> low32 = toBinary(x);
        List<Integer> high32 = toBinary(y);
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
                .TYPE(binaryString2HexString(Type))
                .build();
    }

    /**
     * 将整数转换成有16个二进制数的列表
     *
     * @param x
     * @return
     */
    private static List<Integer> toBinary(int x) {
        String s1 = Integer.toBinaryString(x);
        String[] split = s1.split("");
        List<Integer> ans = new ArrayList<>();
        for(String s : split){
            ans.add(Integer.parseInt(s));
        }
        if(ans.size() < 32){
            int size = 32 - ans.size();
            for(int i = 0; i < size; i++){
                ans.add(0,0);
            }
        }
        return ans;
    }

    /**
     * 110 -> 6
     * @param list
     * @return
     */
    private static String binaryString2HexString(List<Integer> list) {
        int sum = 0;
        int pow = 1;
        Collections.reverse(list);
        for(Integer i : list){
            sum += i * pow;
            pow *= 2;
        }
        return Integer.toHexString(sum);
    }
}
