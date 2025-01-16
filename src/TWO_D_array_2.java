import java.util.Scanner;
public class TWO_D_array_2 {
    static void sum(int [][]  arr1,int  [][] arr2 , int r1,int c1,int r2,int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("the given inputs are wrong");
            return;
        }
        int [][] sum = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(sum[i][j] + " ");

            }
            System.out.println(" ");
        }


    }

    public static void main(String[] args) {
        System.out.println("Enter the no of rows for arr1");
        Scanner sc= new Scanner(System.in);
        int r1= sc.nextInt();
        System.out.println("Enter the no of columns for arr1");
        int c1=sc.nextInt();
        System.out.println("Enter the no of rows for arr2");
        int r2= sc.nextInt();
        System.out.println("Enter the no of columns for arr2");
        int c2=sc.nextInt();
        int [][]arr1=new int[r1][c1];
        int [][]arr2=new int[r2][c2];
        System.out.println("now enter "+ r1*c1+"elements for arr1");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("now enter "+ r2*c2+"elements for arr2");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        sum(arr1,arr2,r1,c1,r2,c2);

    }
}
