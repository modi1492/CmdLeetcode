import java.util.ArrayList;
import java.util.List;

public class IntersectionOfThreeSortedArrays {

    public static void main(String[] args) {
        IntersectionOfThreeSortedArrays i = new IntersectionOfThreeSortedArrays();
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 5, 7, 9};
        int[] arr3 = new int[]{1, 3, 4, 5, 8};

        arr1 = new int[]{197, 418, 523, 876, 1356};
        arr2 = new int[]{501, 880, 1593, 1710, 1870};
        arr3 = new int[]{521, 682, 1337, 1395, 1764};
        System.out.println(i.arraysIntersection(arr1, arr2, arr3));
    }

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = arr3.length;
        int p1 = 0, p2 = 0, p3 = 0;
        List<Integer> ans = new ArrayList<>();
        while (true) {
            int first = arr1[p1];
            int second = arr2[p2];
            int third = arr3[p3];
            if (first == second && second == third) {
                ans.add(first);
                if (p1 != l1 - 1) {
                    p1++;
                }
                if (p2 != l2 - 1) {
                    p2++;
                }
                if (p3 != l3 - 1) {
                    p3++;
                }
            } else {
                if ((first <= second && first <= third) || ((p2 == l2 - 1) && (p3 == l3 - 1) && (p1 != l1 - 1))) {
                    if (p1 != l1 - 1) {
                        p1++;
                    }
                }
                if (second <= first && second <= third || ((p3 == l3 - 1) && (p1 == l1 - 1) && (p2 != l2 - 1))) {
                    if (p2 != l2 - 1) {
                        p2++;
                    }
                }
                if (third <= first && third <= second || ((p3 != l3 - 1) && (p1 == l1 - 1) && (p2 == l2 - 1))) {
                    if (p3 != l3 - 1) {
                        p3++;
                    }
                }
            }
            if (p1 == l1 - 1 && p2 == l2 - 1 && p3 == l3 - 1) {
                if (arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]) {
                    ans.add(arr1[p1]);
                }
                break;
            }
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Intersection-Of-Three-Sorted-Arrays