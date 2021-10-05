public class PowerOfFour{
    public static void main(String[] args) {
        PowerOfFour p = new PowerOfFour();
        System.out.println(p.isPowerOfFour(16));
        System.out.println(p.isPowerOfFour(5));
        System.out.println(p.isPowerOfFour(1));
        System.out.println(0 % 4);
    }

    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while ( n % 4 == 0){
            n /= 4;
        }
        return n == 1;
    }
}