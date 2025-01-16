import java.util.Scanner;
public class logicaloperators {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number ");

        int a = sc.nextInt();
        System.out.println("Eneter the second number ");
        int b =sc.nextInt();

        System.out.println("and" +((a>b)&&(a>=b)));

        System.out.println("or" +((a>b)||(a>=b)));

        System.out.println("not" +!(a>b));


    }
}
