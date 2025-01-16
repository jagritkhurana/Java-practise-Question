import java.util.Scanner;

public class TWO_D_array_3_practise {

    static int[][] array_multiply(int [][] arr1,int r1,int c1,int [][] arr2,int r2,int c2){
        int mul[][]=new int[r1][c2];
        if(c1!=r2){
            System.out.println("Matrix cannot be multiplied");
        }else {
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for (int k=0;k<c1;k++){
                        mul[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }

            }
        }
        return mul;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows for matrix 1");
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        System.out.println("Enter the no of coloumns for matrix 1");
        int c1=sc.nextInt();
        System.out.println("Enter"+r1*c1+"elements");
        int [][]arr1=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter the number of rows for matrix 2");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2");
        int c2=sc.nextInt();
        System.out.println("Enter"+r2*c2+"Elements");
        int arr2[][]=new int[r2][c2];
        for (int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println( " ");
        }
        int mul2[][]=array_multiply(arr1,r1,c1,arr2,r2,c2);
        System.out.println("The multiplied array is ");
        for(int i=0;i<mul2.length;i++){
            for (int j=0;j<mul2[i].length;j++){
                System.out.print(mul2[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
