import java.util.Scanner;

public class TWO_D_array_8_practise {

    static int[][] pascal(int n){
        int ans[][] = new int[n][];

        for(int i=0;i<n;i++){

            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows for pascals triangle");
        int n=sc.nextInt();
        int ans[][]=pascal(5);
        for(int i=0;i<ans.length;i++){
            for (int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
