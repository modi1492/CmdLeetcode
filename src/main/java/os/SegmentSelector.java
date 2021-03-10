package os;

import lombok.*;

import java.util.List;

import static os.Utils.binaryString2Decimal;
import static os.Utils.toBinary;

@Data
@Getter
@Setter
@ToString
@Builder
public class SegmentSelector {
    /** request privilege level */
    private Integer RPL;
    /** table index */
    private Integer TI;
    /** descriptor index */
    private Integer descriptorIndex;

    public static void main(String[] args) {
        System.out.println(getSelector(0x0010));
        System.out.println(getSelector(0x0008 ));
        System.out.println(getSelector(0x0018 ));
        System.out.println(getSelector(0x30 ));
        System.out.println(getSelector(0x38 ));
        System.out.println(getSelector(0x0008 ));
        System.out.println(getSelector(0x0020 ));
        System.out.println(getSelector(0x0028 ));
    }

    /**
     * 根据16位二进制数字输出段选择子
     *
     * @param value
     * @return
     */
    public static SegmentSelector getSelector(int value) {
        List<Integer> integers = toBinary(value, 16);
        Integer RPL = binaryString2Decimal(integers.subList(14, 16));
        Integer TI = binaryString2Decimal(integers.subList(13, 14));
        Integer descriptor = binaryString2Decimal(integers.subList(0, 13));
        return SegmentSelector.builder().RPL(RPL).TI(TI).descriptorIndex(descriptor).build();
    }

}
