import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTransformation {
    public static void main(String[] args) {
        ArrayTransformation a = new ArrayTransformation();
        int[] arr = new int[]{1, 6, 3, 4, 3, 5};
        System.out.println(a.transformArray(arr));
    }

    public List<Integer> transformArray(int[] arr) {
        while (true){
            Set<Integer> smallIndex = new HashSet<>();
            Set<Integer> bigIndex = new HashSet<>();
            for(int i = 1; i < arr.length - 1;i++){
                if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                    smallIndex.add(i);
                }
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    bigIndex.add(i);
                }
            }
            if(smallIndex.isEmpty() && bigIndex.isEmpty()){
                break;
            }else {
                for(Integer index: smallIndex){
                    arr[index]++;
                }
                for(Integer index: bigIndex){
                    arr[index]--;
                }
            }
            smallIndex.clear();
            bigIndex.clear();
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length;i++){
            ans.add(arr[i]);
        }
        return ans;
}}