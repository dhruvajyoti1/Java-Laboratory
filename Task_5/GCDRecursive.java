public class GCDRecursive {
    public static void main(String[] args) {
        int a = 24, b = 36;
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " = " + result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
