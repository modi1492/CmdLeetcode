import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mA = new MergeSortedArray();
        int []num1 = new int[]{1,2,3,0,0,0};
        int [] num2 = new int[]{2,5,6};
        int m = 3, n = 3;
        num1 = new int[]{4,5,6,0,0,0}; m = 3; num2 = new int[]{1,2,3}; n = 3;
        mA.merge(num1,m,num2,n);
    }

    /**
     * 从后往前遍历 从大到小排列
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m -1;       // p指向num1
        int q = n - 1;       // q指向num2
        int length = m + n - 1; // length指向结果数组
        while (p >= 0 && q >= 0){
            if(nums1[p] > nums2[q]){
                nums1[length--] = nums1[p--];
            }else {
                nums1[length--] = nums2[q--];
            }
        }
        while (q >= 0){
            nums1[length--] = nums2[q--];
        }
        while (p >=0){
            nums1[length--] = nums1[p--];
        }
    }
}


// https://leetcode.cn/problems/Merge-Sorted-Array