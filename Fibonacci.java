public class Fibonacci {

    public static long fibonacci(int a) {
        if (a==1 || a==2) {
            return 1;
        } else return fibonacci(a-1) + fibonacci(a-2);
    }

    public static long fibo(int z) {

        if (z == 0) {
            return 0;
        } else if (z == 1) {
            return 1;
        } else {
            return fibo(z - 1) + fibo(z - 2);
        }
    }
}
