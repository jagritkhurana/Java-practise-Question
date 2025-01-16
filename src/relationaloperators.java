import java.util.Scanner;

public class relationaloperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number u want to compare");

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("EQUALS TO " +(num1==num2));

        System.out.println("Greater"+(num1>num2));

        System.out.println("Less"+(num1<num2));

        System.out.println("not"+(num1!=num2));


    }
}
