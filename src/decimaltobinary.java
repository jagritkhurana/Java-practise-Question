import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();

        int ans=0;
        int p=1;
        while (decimal>0){
            int parity=decimal%2;
            ans=ans+parity*p;
            p=p*10;
            decimal=decimal/2;
        }
        System.out.println(ans);
    }

}
