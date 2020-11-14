public class LemonadeChange{
    public static void main(String[] args) {
        LemonadeChange l = new LemonadeChange();
        int[] bills = new int[]{5,5,5,10,20};
        System.out.println(l.lemonadeChange(bills));
        bills = new int[]{5,5,10};
        System.out.println(l.lemonadeChange(bills));
        bills = new int[]{10,10};
        System.out.println(l.lemonadeChange(bills));
        bills = new int[]{5,5,10,10,20};
        System.out.println(l.lemonadeChange(bills));
    }

    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++;
                continue;
            }
            if (bill == 10) {
                if (fiveCount == 0) {
                    return false;
                } else {
                    fiveCount--;
                    tenCount++;
                    continue;
                }
            }
            if (bill == 20) {
                if (tenCount >= 1 && fiveCount >= 1) {
                    tenCount--;
                    fiveCount--;
                    continue;
                }
                if (fiveCount >= 3) {
                    fiveCount -= 3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}