import java.util.Scanner;

public class recursion_3 {

    static int factorial(int n){
        if (n==0){
            int ans=1;
            return ans;
        }
        int ans=n*factorial(n-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n for which you want facotrial of");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+ factorial(n));

    }
}
