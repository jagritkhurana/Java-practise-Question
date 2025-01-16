import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int result1=a&b;
        int result2=a|b;
        int result3=a^b;
        int result4=~a;
        int result5=a<<1;
        int result6=a>>2;
        System.out.println("AND=" +result1);
        System.out.println("OR=" +result2);
        System.out.println("XOR=" +result3);
        System.out.println("COMPLEMENT=" +result4);
        System.out.println("LEFT SHIFT=" +result5);
        System.out.println("RIGHT SHIFT=" +result6);
    }
}
