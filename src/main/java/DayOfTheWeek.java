//(day+2*month+3*(month+1)/5+year+year/4-year/100+year/400)%7

public class DayOfTheWeek {
    public static void main(String[] args) {
        DayOfTheWeek d = new DayOfTheWeek();
        System.out.println(d.dayOfTheWeek(31, 8, 2019));
        System.out.println(d.dayOfTheWeek(18, 7, 1999));
    }

    String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String dayOfTheWeek(int day, int month, int year) {
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int index = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
        return week[index];
    }
}
// https://leetcode.cn/problems/Day-Of-The-Week