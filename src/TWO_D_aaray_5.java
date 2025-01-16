import java.util.Scanner;

public class TWO_D_aaray_5 {
    static int[][] transpose(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of rows -:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the no of columns");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Now enter" + r * c + "elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Orignal array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        int [][] ans = transpose(arr, r, c);

        System.out.println("Transposed array");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }
}