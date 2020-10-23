public class NumberOfGoodPairs{
    public static void main(String[] args) {
        NumberOfGoodPairs n = new NumberOfGoodPairs();
        int[] arr1 = new int[]{1,2,3,1,1,3};
        int[] arr2 = new int[]{1,1,1,1};
        int[] arr3 = new int[]{1,2,3};
        System.out.println(n.numIdenticalPairs(arr1));
        System.out.println(n.numIdenticalPairs(arr2));
        System.out.println(n.numIdenticalPairs(arr3));
    }

    public int numIdenticalPairs(int[] nums) {
        if(nums == null){
            return 0;
        }
        int ans = 0;
        for(int i =0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    ans += 1;
                }
            }
        }
        return ans;
    }
}