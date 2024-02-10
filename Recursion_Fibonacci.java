import java.util.*;
class Recursion_Fibonacci { 
    // recursion function
    int Fibonacci(int n) {
        
        // base case
        if (n <= 1)
        return n;

        // small calculation with recursive call
        // Recursive call being Fibonacci(n-1) & Fibonacci(n-2)
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth position");
        int n = sc.nextInt();
        Recursion_Fibonacci obj = new Recursion_Fibonacci();
        System.out.println(obj.Fibonacci(n));
        sc.close();
    }
}
