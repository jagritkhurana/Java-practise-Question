import java.util.Scanner;
public class Arithmeticoperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");

        int num_1=sc.nextInt();

        System.out.println("Enter the second number");

        int num_2 = sc.nextInt();

        int addition=num_1+num_2;

        System.out.println("Addition"+addition);

        int subtraction=num_1-num_2;

        System.out.println("Subtraction"+subtraction);

        int multiplication=num_1*num_2;

        System.out.println("Multiplication"+multiplication);

        int division=num_1/num_2;

        System.out.println("Division"+division);

        int modulus=num_1%num_2;

        System.out.println("Modulus"+modulus);

        int increment= ++num_1;

        System.out.println("Increment"+increment);

        int decrement=--num_1;

        System.out.println("Decrement"+decrement);


    }
}
