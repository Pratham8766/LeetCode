public class runningSumOfArray{
    public static int[] runningSum(int[] nums) {
        int [] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i-1] + nums[i];
        }
        return arr;
     }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] arr = runningSum(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}