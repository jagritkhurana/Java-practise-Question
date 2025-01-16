import java.util.Scanner;
public class ifelse3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number u want to chk ");

        int num=sc.nextInt();

        if((num%2==0)&&(num%3==0)){
            System.out.println("yes the number is divisible by 3 and is Even");
        }else {
            System.out.println("koi na ni hai toh kya hua ");
        }

    }
}
