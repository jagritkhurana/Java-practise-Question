import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number u want to print numbers upto:");

        int n=sc.nextInt();
        while(n>=1){
            System.out.println("number is " +n);
            n=n-1;
        }

    }
}
