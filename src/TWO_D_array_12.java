import java.util.Scanner;

public class TWO_D_array_12 {

    static int sum_usingbruteforce(int arr[][],int l1,int l2,int r1,int r2){

        int sum=0;
        for(int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum+=arr[i][j];

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter "+r*c+ " Elements" );
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The given array is");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter the values of L1,R1,L2,R2");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();
        System.out.println("The sum form l1 , l2 , r1 , r2 is "+ sum_usingbruteforce(arr,l1,l2,r1,r2));
    }
}
