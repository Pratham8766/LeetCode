public class reverse_int {
    public static int reverse(int a){
        int ans = 0;
        int last;
        int x = a;
        if(x<0){
            x = -1 * x;
        }

        while(a>0){
            last = a%10;
            ans =  ans*10+last;
            a = a/10;
            if(a>Integer.MAX_VALUE){
                return 0;
            }
        }
        if(x<0){
            return (int)-ans;
        }
        return (int) ans;
    }
    //129
    public static void main(String[] args) {
        System.out.println(reverse(210));
    }
    }

