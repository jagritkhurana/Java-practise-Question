import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first no : a");
        System.out.println("Enter second no:b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        for (int i=1;i<=b;i++){
            ans=ans*a;

        }
        System.out.println(ans);
    }
}
