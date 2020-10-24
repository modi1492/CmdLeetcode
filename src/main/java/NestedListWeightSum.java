import basic.NestedInteger;

import java.util.List;

public class NestedListWeightSum{

    public static void main(String[] args) {
        // [2,[1,1]]
    }

    private static int deep = 0;

    public int depthSum(List<NestedInteger> nestedList) {
        deep++;
        int ans = 0;
        for(NestedInteger n: nestedList){
            if(n.isInteger()){
                ans += n.getInteger() * deep;
            }else {
                ans += depthSum(n.getList());
            }
        }
        deep--;
        return ans;
    }
}