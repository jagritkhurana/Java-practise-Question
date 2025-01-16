import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        String result;
        result=(num%2==0)?"Even":"Odd";
        System.out.println("ans is "+result);


    }
}
