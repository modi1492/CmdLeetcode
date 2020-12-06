import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms{
    public static void main(String[] args) {
        MeetingRooms m = new MeetingRooms();
        int[][] arr = new int[][]{{5,10},{0,30},{15,20}};
        System.out.println(m.canAttendMeetings(arr));
        arr = new int[][]{{7,10},{2,4}};
        System.out.println(m.canAttendMeetings(arr));
    }

    /**
     * 会议开始时间从小到大，校验后面的会议能否在前面的会议结束前开始
     * @param intervals
     * @return
     */
    public boolean canAttendMeetings(int[][] intervals) {
        Comparator comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                return arr1[0] - arr2[0];
            }
        };
        Arrays.sort(intervals, comparator);
        for(int i = 0; i < intervals.length -1;i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }
}