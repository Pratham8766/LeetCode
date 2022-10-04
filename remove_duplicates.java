public class remove_duplicates{
        public int removeDuplicates(int[] nums) {
            int j = 0;
            int k = nums.length;
            for(int i = 1; i<k; i++){
                if(nums[j]!= nums[i]){
                    j++;
                    nums[j] = nums[i];
                }
            }
            return j+1;
        }

    public static void main(String [] args) {
        
    }
}