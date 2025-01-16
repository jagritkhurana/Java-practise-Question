import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the principal amount");
        Float principle=sc.nextFloat();

        System.out.println("Enter the Rate of interest");
        Float rate=sc.nextFloat();

        System.out.println("Enter the Time ");
        Float time =sc.nextFloat();

        float interest=(principle*rate*time)/100;

        System.out.println("The simple interest is :" +interest);
    }
}
