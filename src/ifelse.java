import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Print the number u want to chk even odd");
        int a=sc.nextInt();

        if(a%2==0){
            System.out.println("the number is even");

        }else {
            System.out.println("the number is odd");
        }

    }
}
