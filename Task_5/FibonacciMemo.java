import java.util.HashMap;

public class FibonacciMemo {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println("fib(" + n + ") = " + result);
    }

    public static int fib(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }


        if (memo.containsKey(n)) {
            return memo.get(n);
        }


        int value = fib(n - 1) + fib(n - 2);
        memo.put(n, value);

        return value;
    }
}

