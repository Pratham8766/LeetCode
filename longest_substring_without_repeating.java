import java.util.HashMap;
import java.util.Map;

public class longest_substring_without_repeating{
    public void lswr(String s){
        // HashMap <Character, Integer> hm = new HashMap<>();
        // for (int i = 0; i < s.length(); i++){
            
        // } 
    

    Map<Character,Integer> map = new HashMap<>();
        int l=0,r=0;
        int op=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(l,map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r),r);
            op=Math.max(op,r-l+1);
            r++;
        
    }
        
}
    public static void main(String[] args) {
        
    }
}