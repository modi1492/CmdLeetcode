public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase t = new ToLowerCase();
        System.out.println(t.toLowerCase("Hello"));
        System.out.println((int)'H');
        System.out.println((char) 104);
    }

    public String toLowerCase(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char c = (char) (str.charAt(i) + 32);
                sb.append( c);
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}