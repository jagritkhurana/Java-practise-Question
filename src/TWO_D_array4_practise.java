import java.util.Scanner;

public class TWO_D_array4_practise {

    static int[][] reversearray(int arr[][],int r,int c){
        int reverse[][]=new int[r][c];
        for (int i=0;i<r;i++){
            int k=0;
            for (int j=c-1;j>=0;j--){
                reverse[i][k]=arr[i][j];
                k++;
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of rows");
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        System.out.println("Enter the no of columns");
        int c=sc.nextInt();
        System.out.println("Enter"+r*c+"Elements");
        int arr[][]=new int[r][c];
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
        int reverse2[][]=reversearray(arr,r,c);
        System.out.println("The reversed array is");
        for (int i=0;i<reverse2.length;i++){
            for (int j=0;j<reverse2[i].length;j++){
                System.out.print(reverse2[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
