public class abc{
    class Solution {
        public int maxArea(int[] height) {
            int max = 0;
            int left = 0;
            int right = height.length-1;
            while(right>left){
                max = Math.max(max , ((right-left) * Math.min(height[right], height[left])));
                if(height[right]>height[left]) {
                    left++;
                }
                else{
                    right --;
                } 
            }
            return max;
        }
    }
    public static void main(String[] args) {
        // System.out.println(reverse(120));
        System.out.println(1/10);
    }
}
// 129
// M C M X C I V
