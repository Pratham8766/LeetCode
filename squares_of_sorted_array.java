import java.util.Arrays;

public class squares_of_sorted_array {
    public int indexOfMin,temp;
    public  int [] sqarr(int [] nums){
        Arrays.sort(nums);
        int [] arr = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        squares_of_sorted_array sr = new squares_of_sorted_array();
        int [] arr = {-4,-1,0,3,10};
        int [] sqr = sr.sqarr(arr);
        for (int i : sqr) {
            System.out.println(i);
        }        
    }
}
