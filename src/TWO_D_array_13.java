import java.util.Scanner;

public class TWO_D_array_13 {

    static void prefixsum(int arr[][]){

        int r=arr.length;
        int c=arr[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }
    }

    static int sumofarrays(int arr[][], int l1 , int r1, int l2, int r2){
        prefixsum(arr);
        int sum=0;

        for (int i= l1;i<=l2;i++){
            if(r1>=1){
                sum+=arr[i][r2]-arr[i][r1-1];

            }else {
                sum+=arr[i][r2];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows for the matrix");
        int r = sc.nextInt();
        System.out.println("Enter the column for the matrix");
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter "+r*c+" Elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("The given array is ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" Enter l1 , r1 , l2 ,r2 ");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2=sc.nextInt();
        System.out.println(" the sum of matrix is "+ sumofarrays(arr,l1,r1,l2,r2));

    }
}
