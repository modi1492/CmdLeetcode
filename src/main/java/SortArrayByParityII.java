import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParityII {
    public static void main(String[] args) {
        SortArrayByParityII s = new SortArrayByParityII();
        int[] arr = new int[]{4, 2, 5, 7};
//        arr = new int[]{3, 4};
//        arr = new int[]{648, 831, 560, 986, 192, 424, 997, 829, 897, 843};
        System.out.println(Arrays.toString(s.sortArrayByParityII(arr)));
    }

    public int[] sortArrayByParityII(int[] a) {
        List<Integer> lst1 = new ArrayList<>(); // 该是奇数确是偶数
        List<Integer> lst2 = new ArrayList<>(); // 该是偶数确是奇数
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1 && a[i] % 2 == 0) {
                lst1.add(i);
            }
            if (i % 2 == 0 && a[i] % 2 == 1) {
                lst2.add(i);
            }
        }
        int len = lst1.size();
        for (int j = 0; j < len; j++) {
            int firstIndex = lst1.get(j);
            int secondIndex = lst2.get(j);
            //交换
            int tmp = a[firstIndex];
            a[firstIndex] = a[secondIndex];
            a[secondIndex] = tmp;
        }
        return a;
    }
}