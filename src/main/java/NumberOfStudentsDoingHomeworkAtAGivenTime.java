public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime n = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};
        int queryTime = 4;
        System.out.println(n.busyStudent(startTime, endTime, queryTime));

        startTime = new int[]{4};
        endTime = new int[]{4};
        queryTime = 4;
        System.out.println(n.busyStudent(startTime, endTime, queryTime));
        startTime = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        endTime = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
        queryTime = 5;
        System.out.println(n.busyStudent(startTime, endTime, queryTime));

    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                ans += 1;
            }
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Number-Of-Students-Doing-Homework-At-AGiven-Time