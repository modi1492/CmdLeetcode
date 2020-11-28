import java.util.Arrays;

public class PlusOne{
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        int[] nums = new int[]{1,2,3};
//        System.out.println(Arrays.toString(p.plusOne(nums)));
        nums = new int[]{9,9,9};
        System.out.println(Arrays.toString(p.plusOne(nums)));
    }

    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            int tmp;
            if(i == digits.length -1){
                tmp = (digits[i] + 1 + carry) % 10;
                carry = (digits[i] + 1 + carry) / 10;
                digits[i] = tmp;
            }else {
                tmp = (digits[i] + carry) % 10;
                carry =  (digits[i] + carry) / 10;
                digits[i] = tmp;
            }


            if(carry == 0){
                break;
            }
        }

        if(carry ==0){
            return digits;
        }else {
            int len = digits.length + 1;
            int[] ans = new int[len];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, digits.length);
            return ans;
        }
    }
}