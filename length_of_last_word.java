public class length_of_last_word {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int len;
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == ' '){
                break;
            }
            res+=s.charAt(i);
        }
        len = res.length();
        return len;
    }
    public static void main(String[] args) {
        String s = "Hello World   ";
        System.out.println(lengthOfLastWord(s));
    }
}
