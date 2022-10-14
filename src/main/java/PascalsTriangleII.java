import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        PascalsTriangleII p = new PascalsTriangleII();
        System.out.println(p.getRow(0));
        System.out.println(p.getRow(1));
        System.out.println(p.getRow(3));
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex == 0) {
            res.add(1);
            return res;
        }
        if (rowIndex == 1) {
            res.add(1);
            res.add(1);
            return res;
        }
        res.add(1);
        res.add(1);
        for (int i = 2; i <= rowIndex; i++) {
            res = getList(res);
        }
        return res;
    }

    List<Integer> getList(List<Integer> lst) {
        List<Integer> res = new ArrayList<>();
        res.add(lst.get(0));
        for (int i = 0; i < lst.size() - 1; i++) {
            res.add(lst.get(i) + lst.get(i + 1));
        }
        res.add(lst.get(lst.size() - 1));
        return res;
    }
}

// https://leetcode.cn/problems/Pascals-Triangle-II