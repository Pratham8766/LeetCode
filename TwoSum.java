public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            } 
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int b [] = {3,2,3};
        int [] a= twoSum(b,6);

        for (int i : a) {
            System.out.println(i);
        }

    }
}