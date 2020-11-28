import java.util.HashMap;
import java.util.Map;

/**
 * 1089. 复写零
 */
public class DuplicateZeros{
    /**
     * [1,0,2,3,0,4,5,0]
     * [1,0,0,2,3,0,0,4]
     * HashMap 记录每个非0元素前面有几个0，如果有x个0则向后移动一个元素
     * @param arr
     */
    public void duplicateZeros(int[] arr) {
        int zeroCount = 0;
        Map<Integer,Integer> map = new HashMap<>(); // 元素前面有多少个0
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }
            if(arr[i] != 0){
                map.put(i,zeroCount);
            }
        }
    }
}