import java.util.Scanner;
public class sumwithfor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number till which u want to calculate sum");

        int n=sc.nextInt();
        int sum=0;
        for(int num=1;num<=n;num++){
            sum=sum+num;

        }
        System.out.println("The sum of numbers n are :" +sum);
    }
}
