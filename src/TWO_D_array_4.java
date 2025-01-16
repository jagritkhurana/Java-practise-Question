import java.util.Scanner;

public class TWO_D_array_4 {
    static int [][] reverseateach(int [] [] arr,int r,int c){
        int [][] ans=new int[r][c];

        for(int i=0;i<r;i++){
            int k=0;
            for(int j=c-1;j>=0;j--){
                ans[i][k]=arr[i][j];
                    k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter thr no of rows");
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        System.out.println("Enter the no of columns");
        int c= sc.nextInt();
        int [][] arr=new int[r][c];
        System.out.println("Enter "+r*c+"Elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("orignal array");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        int [][] ans= reverseateach(arr,r,c);
        System.out.println("reversed array");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(ans[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
