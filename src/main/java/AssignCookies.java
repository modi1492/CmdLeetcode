import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/assign-cookies/
 */
public class AssignCookies{
    public static void main(String[] args) {
        AssignCookies a = new AssignCookies();
        int[] g = {1,2,3};
        int[] s = {1,1};
        if(a.findContentChildren(g, s) == 1){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }

    /**
     *
     * @param g 孩子
     * @param s 饼干
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(s));
        int i = 0, j = 0;
        while (i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
                res++;
            }else {
                j++;
            }
        }
        return res;
    }
}
// https://leetcode.cn/problems/Assign-Cookies