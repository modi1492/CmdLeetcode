public class RectangleOverlap {
    public static void main(String[] args) {
        RectangleOverlap r = new RectangleOverlap();
    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1 == null || rec2 == null || rec1.length == 0 || rec2.length == 0) {
            return false;
        }
        int r1x1 = rec1[0];
        int r1y1 = rec1[1];
        int r1x2 = rec1[2];
        int r1y2 = rec1[3];

        int r2x1 = rec2[0];
        int r2y1 = rec2[1];
        int r2x2 = rec2[2];
        int r2y2 = rec2[3];

        if (r1x1 > r2x1 && r1x1 < r2x2 && r1y1 > r2y1 && r1y1 < r2y2) {
            return true;
        }
        return true;
    }
}
// https://leetcode.cn/problems/Rectangle-Overlap