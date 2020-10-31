public class ReplaceSpace {
    public static void main(String[] args) {
        ReplaceSpace r = new ReplaceSpace();
        System.out.println(r.replaceSpace("We are happy."));
    }
    public String replaceSpace(String s) {
        if(s == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
