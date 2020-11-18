import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle p = new PascalsTriangle();
        System.out.println(p.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                List<Integer> l1 = new ArrayList<Integer>();
                l1.add(1);
                ans.add(l1);
                continue;
            }
            if (i == 1) {
                List<Integer> l2 = new ArrayList<Integer>();
                l2.add(1);
                l2.add(1);
                ans.add(l2);
                continue;
            }
            List<Integer> prv = ans.get(i - 1);
            List<Integer> lst = new ArrayList<>();
            lst.add(1);
            for (int j = 0; j < prv.size() - 1; j++) {
                lst.add(prv.get(j) + prv.get(j + 1));
            }
            lst.add(1);
            ans.add(lst);
        }
        return ans;
    }
}