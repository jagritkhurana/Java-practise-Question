import java.util.Scanner;

public class recursion_1 {

    static void printincreasing(int n){
        if (n==1){
            System.out.println("1");
            return;
        }
        printincreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printincreasing(n);
    }
}
