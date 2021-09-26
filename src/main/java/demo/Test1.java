import java.util.GregorianCalendar;

class Demo<T extends Comparable<? super T>>{}

public class Test1
{
    public static void main(String[] args) {
        Demo<GregorianCalendar> p = null; // 编译正确
    }
}