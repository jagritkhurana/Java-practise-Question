import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value till which we want to calculate sum of the series ");
        int n=sc.nextInt();
        int ans=0;
        for(int num=1;num<=n;num++){
            if(num%2==0){
                ans=ans-num;
            }else{
                ans=ans+num;


            }
        }
        System.out.println("sum of the series is " +ans);
    }
}
