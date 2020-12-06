import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations{
    public static void main(String[] args) {
        BuildAnArrayWithStackOperations b = new BuildAnArrayWithStackOperations();
        int[] target = new int[]{1,3};
        System.out.println(b.buildArray(target, 3));
        target = new int[]{1,2,3};
        System.out.println(b.buildArray(target, 3));
        target = new int[]{1,2};
        System.out.println(b.buildArray(target, 3));
        target = new int[]{2,3,4};
        System.out.println(b.buildArray(target, 3));
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        int expect = 1;
        while (i < target.length){
            int num = target[i] - expect;
            if(num == 0){
                ans.add("Push");
                expect++;
            }else {
                for(int j = 0; j < num;j++){
                    ans.add("Push");
                    ans.add("Pop");
                }
                ans.add("Push");
                expect = target[i] + 1;
            }
            i++;
        }
        return ans;
    }
}