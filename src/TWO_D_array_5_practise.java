import javax.lang.model.element.Element;
import java.util.Scanner;

public class TWO_D_array_5_practise {
    static int[][] transpose(int arr[][],int r,int c){
        int transpose[][]=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        return transpose;
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
        int transpose2[][]=transpose(arr,r,c);
        System.out.println("The transposed array");
        for (int i=0;i<transpose2.length;i++){
            for (int j=0;j<transpose2[i].length;j++){
                System.out.print(transpose2[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
