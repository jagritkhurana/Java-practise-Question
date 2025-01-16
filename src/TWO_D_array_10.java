import java.util.Scanner;

public class TWO_D_array_10 {

    static int[][] spiralit(int n){
        int arr[][]=new int[n][n];

        int top_row=0;int bottom_row=n-1;
        int left_column=0;int right_column=n-1;

        int curr=1;
        while (curr<=n*n){

        for (int j=left_column;j<=right_column&&curr<=n*n;j++){
            arr[top_row][j]=curr;
            curr++;
        }
        top_row++;

        for (int i = top_row;i<=bottom_row&&curr<=n*n;i++){
            arr[i][right_column]=curr;
            curr++;
        }
        right_column--;

        for (int j=right_column;j>=left_column&&curr<=n*n;j--){
            arr[bottom_row][j]=curr;
            curr++;
        }
        bottom_row--;

        for (int i=bottom_row;i>=top_row&&curr<=n*n;i--){
            arr[i][left_column]=curr;
            curr++;
        }
        left_column++;

        }

        return arr;

    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n for which u want a spiral matrix");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int arr2[][]=spiralit(n);
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
