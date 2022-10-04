import java.util.HashMap;

public class roman_to_Integer{
    static int R_I(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I', 1); 
        hm.put('V', 5); 
        hm.put('X', 10); 
        hm.put('L', 50); 
        hm.put('C', 100); 
        hm.put('D', 500); 
        hm.put('M', 1000);
        int result = hm.get(str.charAt(str.length()-1));
        for (int i = str.length()-2; i >= 0; i--) {
            if(hm.get(str.charAt(i)) > hm.get(str.charAt(i+1))){
                result+= hm.get(str.charAt(i));
            }
            else{
                result-=hm.get(str.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(R_I("MCMXCIV"));
        // R_I("MCMXCIV");
    }
}