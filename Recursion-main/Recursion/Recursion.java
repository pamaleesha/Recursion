//Factorial Using Recursion in Java
public class RecursionExample {
    // Recursive method to find factorial of a number
    public static int factorial(int n) {
        // Base case: if n is 1 or 0, return 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: multiply n by the factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
