public class RomanToInteger {
    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String s1 = "III";      // 3
        String s2 = "IV";       // 4
        String s3 = "LVIII";    // 58
        System.out.println(romanToInteger.romanToInt(s1));
        System.out.println(romanToInteger.romanToInt(s2));
        System.out.println(romanToInteger.romanToInt(s3));
    }

    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < s.length();i++){
            if(i == s.length() - 1){
                ans += getValue(s.charAt(i));
                break;
            }
            if(getValue(s.charAt(i)) >= getValue(s.charAt(i+1))){
                ans += getValue(s.charAt(i));
            }else {
                ans -= getValue(s.charAt(i));
            }
        }
        return ans;
    }

    int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
}