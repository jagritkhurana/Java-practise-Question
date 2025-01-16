import java.util.Scanner;
public class multipleof5and7 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         int num=sc.nextInt();

         while(num<=50){
             if (num%5==0&&num%7==0){
                 break;

             }
             num++;
             System.out.println(num);
         }

    }
}
