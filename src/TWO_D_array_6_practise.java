import java.util.Scanner;

public class TWO_D_array_6_practise {
    static void tranposeinplace(int arr[][],int r, int c){
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int arr[][]=new int [r][c];
        System.out.println("Enter"+r*c+"Elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The given array is ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }

        tranposeinplace(arr,r,c);
        System.out.println(" The transposed array is");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
