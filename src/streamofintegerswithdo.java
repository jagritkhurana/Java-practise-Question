import java.util.Scanner;
public class streamofintegerswithdo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;

        do{
            sum=sum+num;
            num=sc.nextInt();

        }while(num!=-1);
        System.out.println(sum);
    }
}
