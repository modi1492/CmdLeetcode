public class WalkingRobotSimulation {
    public static void main(String[] args) {

    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int ans = 0;
        // 方向 0表示向北 1:东 3:南 3:西
        int direct = 0;
        for (int i = 0; i < commands.length; i++) {
            if (commands[i] < 0) {
                direct = adjustDirect(direct, commands[i]);
                continue;
            }


        }
        return 0;
    }

    int[] forward(int x, int y, int direct, int distance, int[][] obstacles) {
        int x1 = x;
        int y1 = y;
        switch (direct) {
            case 0:
                y1 = y + distance;
                break;
            case 1:
                x1 = x + distance;
                break;
            case 2:
                y1 = y - distance;
                break;
            case 3:
                x1 = x - distance;
                break;

        }
        // 判断是否有障碍
        int xmin = Math.min(x, x1);
        int xmax = Math.max(x, x1);
        int ymin = Math.min(y, y1);
        int ymax = Math.max(y, y1);
        for (int[] obstacle : obstacles) {
            if (obstacle[0] >= xmin && obstacle[0] <= xmax && obstacle[1] == y) {

            }
        }


        return new int[0];


    }

    int adjustDirect(int direct, int offset) {
        switch (direct) {
            // 北
            case 0:
                //向右转 东
                if (offset == -1) {
                    return 1;
                }
                //向左转 西
                if (offset == -2) {
                    return 3;
                }
                break;
            //东
            case 1:
                //右转 南
                if (offset == -1) {
                    return 3;
                }
                if (offset == -2) {
                    return 0;
                }
                break;
            //南
            case 2:
                // 右转 西
                if (offset == -1) {
                    return 3;
                }
                // 左转 东
                if (offset == -2) {
                    return 1;
                }
                break;
            // 西
            case 3:
                //右转 北
                if (offset == -1) {
                    return 0;
                }
                //左转 南
                if (offset == -2) {
                    return 3;
                }
                break;
        }
        return 0;
    }
}
// https://leetcode.cn/problems/Walking-Robot-Simulation