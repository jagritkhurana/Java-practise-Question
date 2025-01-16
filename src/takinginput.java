import java.util.Scanner;

public class takinginput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be printed");

        int num1=sc.nextInt();

        System.out.println("the number enterd"+num1);

        System.out.println("Enter the string to be printed");

        String hi=sc.next();

        System.out.println("The entered string is  "+hi);

    }
}
