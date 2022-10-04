public class palindrome{
    static boolean isPalindrome(int a){
        String s = Integer.toString(a);
        String reverse = "";
        for (int i = s.length()-1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if(s.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if(isPalindrome(-121)){
            System.out.println("IT is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}