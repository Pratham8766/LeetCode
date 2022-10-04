class Solution{
    public String lcp(String [] args){
        String target = args[0];

        for (String string : args) {
            for (int i = 0; (i < string.length()) && i < target.length(); i++) {
                if(string.charAt(i) != target.charAt(i)){
                    target = string.substring(0, i);
                    break;
                }
            }
            if(string.length() < target.length()){
                target = string;
            }
        }

        return target;
    }
}
public class longest_common_prefix{
    public static void main(String[] args) {
        Solution s = new Solution();
        String [] arr = {"flower","flow","flight"};
        String prf = s.lcp(arr);
        System.out.println(prf);
    }
}