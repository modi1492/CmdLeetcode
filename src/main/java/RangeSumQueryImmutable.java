public class RangeSumQueryImmutable{

    private int[] arr;
    public static void main(String[] args) {

    }

    public RangeSumQueryImmutable(int[] nums) {
        arr = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right;i++){
            sum += arr[i];
        }
        return sum;
    }
}