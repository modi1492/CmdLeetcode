public class DefangingAnIpAddress {
    public static void main(String[] args) {
        DefangingAnIpAddress d = new DefangingAnIpAddress();
        String s = "1.1.1.1";
        System.out.println(d.defangIPaddr(s));
        s = "255.100.50.0";
        System.out.println(d.defangIPaddr(s));
    }

    public String defangIPaddr(String address) {
        if (address == null || address.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
                continue;
            }
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}