import java.util.Scanner;
public class numbersreversefor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number from which u want to print in reverse");

        int n= sc.nextInt();

        for(int num=n;num>=1;num--){
            System.out.println(num);
        }
    }
}
