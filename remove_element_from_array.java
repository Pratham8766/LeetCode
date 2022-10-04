public class remove_element_from_array{
    public static int remove_el(int [] arr, int target){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=target){
                arr[j++] = arr[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        int b = remove_el(arr, 3);
        System.out.println(b);
    }
}