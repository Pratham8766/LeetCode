public class sqrt_x {
    public static int mySqrt(int x) {
        double res = Math.sqrt(x);
        int a = (int) res;
        return a;
    }
    public static void main(String[] args) {
        System.out.print(mySqrt(8));
    }
}
