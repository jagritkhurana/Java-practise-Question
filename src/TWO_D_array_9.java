import java.util.Scanner;

public class TWO_D_array_9 {
    static void spiralmatrix(int arr[][], int r,int c){
        int top_row=0;int bottom_row=r-1;
        int left_column=0;int right_column=c-1;
        int total_elements=0;
        while (total_elements<r*c){

            for (int j=left_column;j<=right_column&&total_elements<r*c;j++){
                System.out.print(arr[top_row][j]+ " ");
                total_elements++;
            }
            top_row++;

            for (int i=top_row;i<=bottom_row&&total_elements<r*c;i++){
                System.out.print(arr[i][right_column]+ " ");
                total_elements++;
            }
            right_column--;
            for (int j=right_column;j>=left_column&&total_elements<r*c;j--){
                System.out.print(arr[bottom_row][j]+ " ");
                total_elements++;
            }
            bottom_row--;
            for (int i=bottom_row;i>=top_row&&total_elements<r*c;i--){
                System.out.print(arr[i][left_column]+" ");
                total_elements++;
            }
            left_column++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        System.out.println("Enter the number of columns");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter"+r*c+"Elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("The given array is ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("The spiral elements are");
        spiralmatrix(arr,r,c);

    }
}
