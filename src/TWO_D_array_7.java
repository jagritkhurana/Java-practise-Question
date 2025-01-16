import java.util.Scanner;

public class TWO_D_array_7 {
    static void transpose(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static void reverse(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }


    static void rotate(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Emter" + " " + r * c + " " + "elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Orignal array");
        print(arr);
        System.out.println("transposed array");
        transpose(arr, r, c);
        print(arr);
        System.out.println("rotated array");
        rotate(arr);

        print(arr);
    }
}

