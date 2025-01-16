import java.util.Scanner;

public class reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num=sc.nextInt();
        int ans=0;
        while(num>0){
            ans=ans*10+num%10;
            num=num/10;

        }
        System.out.println(ans);
    }
}
