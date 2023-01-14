public class recursion01 {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int result;
        result = factorial(n-1) * n; // recursion function calls itself in a smaller version

        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
/*
 * compute the factorial of a number
 */