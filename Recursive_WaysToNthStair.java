import java.util.*;
class Recursive_WaysToNthStair { 

    // recursive function
    int waysToNthStair(int n){
        if (n == 1|| n==2){
        return n;
        }
        // Small calculation with recursive call
        // Recusive call being waysToNthStair(n-1)& waysToNthStair(n-2)
        return waysToNthStair(n-1) + waysToNthStair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs ");
        int n = sc.nextInt();
        Recursive_WaysToNthStair obj = new Recursive_WaysToNthStair();
        System.out.println(obj.waysToNthStair(n));
        sc.close();
        
    }
}