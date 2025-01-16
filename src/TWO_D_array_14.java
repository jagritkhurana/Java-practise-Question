import java.util.Scanner;

public class TWO_D_array_14 {

    static void prefixsumrc(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }

        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }
    }
    static int sumarray( int arr[][] , int l1 ,int r1,int l2,int r2){
        int ans=0;int sum=0;int up=0;int left=0;int leftup=0;
        prefixsumrc(arr);
        sum=arr[l2][r2];
        if (r1>=1){
            left=arr[l2][r1-1];
        }
        if (l1>=1){
            up=arr[l1-1][r2];
        }
        if (l1>=1&&r1>=1){
            leftup=arr[l1-1][r1-1];
        }
        ans=sum-left-up+leftup;
        return ans;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the number of rows for the matrix");
        int r= sc.nextInt();
        System.out.println("Enter the number of column for the matrix");
        int c= sc.nextInt();
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
        System.out.println("Enter the value of l1,r1,l2,r2");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();
        System.out.println("The sum of array is "+ sumarray(arr,l1,r1,l2,r2));


    }
}
