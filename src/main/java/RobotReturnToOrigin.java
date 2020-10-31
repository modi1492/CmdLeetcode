public class RobotReturnToOrigin {
    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        if (moves == null) {
            return true;
        }
        int upNumb = 0;
        int downNum = 0;
        int leftNum = 0;
        int rightNum = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    upNumb++;
                    break;
                case 'D':
                    downNum++;
                    break;
                case 'L':
                    leftNum++;
                    break;
                case 'R':
                    rightNum++;
                    break;
                default:
                    break;
            }
        }
        return upNumb == downNum && leftNum == rightNum;
    }
}