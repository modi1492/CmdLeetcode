//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
///** https://leetcode-cn.com/problems/pond-sizes-lcci/ 面试题 16.19. 水域大小 */
//public class PondSize {
//    int[][] direction = new int[][]{{-1,-1},{-1,0},{-1,1},{0,1},{0,-1},{1,0},{1,1},{1,-1}};
//    class Coordinate {
//        private int x;
//        private int y;
//
//        Coordinate(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//    public int[] pondSizes(int[][] land) {
//        if (land == null || land.length == 0 || land[0].length == 0) {
//            return new int[0];
//        }
//        int rowNum = land.length;
//        int colNum = land[0].length;
//        List<Integer> lst = new ArrayList<>();
//        for (int i = 0; i < rowNum; i++) {
//            for (int j = 0; j < colNum; j++) {
//                // find a pond, breadth first search, add the area of pond to lst
//                if (land[i][j] == 0) {
//                    int sum = 0;
//                    Queue<Coordinate> queue = new LinkedList<>();
//                    queue.offer(new Coordinate(i, j));
//                    while (!queue.isEmpty()) {
//                        Coordinate poll = queue.poll();
//                        sum++;
//                        // make one element's left up right down 1 and add it to queue
//                        // if it equals to 0 and in boundary
//                        for (int k = 0; k < direction.length; k++){
//                            int[] d = direction[k];
//
//                        }
//
//                    }
//                    lst.add(sum);
//                }
//            }
//        }
//    }
//
//    private boolean inBoundary(int x, int y, int rowNum, int colRow) {
//        return x >= 0 && x < rowNum && y >= 0 && y < colRow;
//    }
//}

// https://leetcode.cn/problems/Pond-Size