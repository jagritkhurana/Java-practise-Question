import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int ans=0;
        int p=1;
        while(binary>0){
            int n=binary%10;
            ans=ans+n*p;
            binary=binary/10;
            p=p*2;

        }
        System.out.println(ans);
    }
}
