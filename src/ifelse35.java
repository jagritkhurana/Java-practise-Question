import java.util.Scanner;
public class ifelse35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a%3==0||a%5==0){
            System.out.println("The number is divisible by 3 or 5");
        }else{
            System.out.println("The number is not divisible");
        }
    }
}
