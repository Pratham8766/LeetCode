public class Container_With_Most_Water {
    public static int maxArea(int [] height){
        int max = 0;
        int left = 0;
        int right = height.length-1;

        while(right>left){
            max = Math.max(max, (Math.min(height[left],height[right])) * (right-left));
            if(height[right] > height[left]){
                left++;
            }
            else{
                right--;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int [] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
}
