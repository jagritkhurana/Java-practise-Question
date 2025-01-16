import java.util.Scanner;

public class TWO_D_array_2_practise {

    static int[][] add_array(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        int sum[][]=new int[r1][c1];
        if (r1==r2&&c1==c2){
            for(int i=0;i<sum.length;i++){
                for(int j=0;j<sum[i].length;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }

        }else {
            System.out.println("rows and columns do not match");
        }
        return sum;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r1=sc.nextInt();
        System.out.println("Enter the no of columns");
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter total "+ r1*c1 + " Elements");
        for(int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Enter no of rows");
        int r2=sc.nextInt();
        System.out.println("Enter the no of columns");
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter total "+ r2*c2 + " Elements");
        for(int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println(" ");
        }
        int sum2[][]=add_array(arr1,r1,c1,arr2,r2,c2);

        System.out.println("The sum of array is ");
        for (int i=0;i<sum2.length;i++){
            for (int j=0;j<sum2[i].length;j++){
                System.out.print(sum2[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
