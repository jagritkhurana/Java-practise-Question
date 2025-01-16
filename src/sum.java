import java.util.Scanner;
public class sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Print the number n till u want to calculate sum");

        int n=sc.nextInt();
        int sum=0;
        int num=1;
        while(num<=n){
            sum=sum+num;
            num++;
        }
        System.out.println("The sum is : " +sum);




    }
}
