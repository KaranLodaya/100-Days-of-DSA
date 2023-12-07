import java.util.*;
class Recursion_Sum { 
    
    int SumToN(int n){
        if (n==1){
            return 1;
        }
        int sum = n + SumToN(n-1);
        return sum;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Recursion_Sum obj = new Recursion_Sum();
        System.out.println(obj.SumToN(n));
        sc.close();
    }
}
