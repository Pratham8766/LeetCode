public class insert_position {
    public static int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){
                ans = i;
                return ans;
            }
            else if(target < nums[i]){
                ans = i;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a = {1,3,5,6};
        int b = searchInsert(a, 7);
        System.out.println(b);
    }
}
