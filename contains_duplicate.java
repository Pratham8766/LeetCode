import java.util.HashMap;

public class contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])){
                return true;
            }
            hm.put(nums[i], 1);
        }
        return false;
    }
    public static void main(String[] args) {
        int n [] = {1,2,3,4,1};
        boolean b = containsDuplicate(n);
        System.out.println(b);
    }
    
}
