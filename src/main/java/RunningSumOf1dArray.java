public class RunningSumOf1dArray{
    public static void main(String[] args) {
        RunningSumOf1dArray r = new RunningSumOf1dArray();
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,1,1,1,1};
        int[] arr3 = new int[]{3,1,2,10,1};
        r.ArrPrint(arr1);
        int[] ans1 = r.runningSum(arr1);
        r.ArrPrint(ans1);
    }

    public int[] runningSum(int[] nums) {
        if(nums == null){
            return new int[]{};
        }
        int length = nums.length;
        int[] ans = new int[length];
        int sum = 0;
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }

    public void ArrPrint(int [] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}