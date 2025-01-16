import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to calculate digits of");
        int num=sc.nextInt();
        int count=0;
        int c=num;
        while(num>0){
            num=num/10;
            count ++;
        }
        System.out.println("the number was "+c +"counts of digits are"+count);

    }
}
