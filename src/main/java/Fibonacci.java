import java.util.HashMap;

public class Fibonacci {
    private static HashMap<Integer,Integer> fibo = new HashMap<Integer, Integer>();
    private static int fibonacci(int n) {
        if(n <= 0) return 0;
        if(n <= 2) {
            return 1;
        } else {
            if((fibo.get(n)) == null) {
                int sum = fibonacci(n-1) + fibonacci(n-2);
                fibo.put(n,sum);
            }
        }
        return fibo.get(n);
    }

    public static void main(String[] args) {
        int fiboSum=fibonacci(1000);
        System.out.println(fiboSum);
    }
}
