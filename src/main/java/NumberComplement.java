public class NumberComplement {
    public static void main(String[] args) {
        NumberComplement n = new NumberComplement();
//        System.out.println(n.findComplement(5));        //2
//        System.out.println(n.findComplement(1));        //0
        System.out.println(n.findComplement(13));        //2
    }

    /**
     * 输入   	00001101
     * <p>
     * 算子		00001111
     * <p>
     * 结果		00000010
     *
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int maxBit = 0;
        int tmp = num;
        while (tmp != 0) {
            tmp = tmp >> 1;
            maxBit++;
        }
        // 算子
        int operator = (1 << maxBit) - 1;
        return num ^ operator;
    }
}