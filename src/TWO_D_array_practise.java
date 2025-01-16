import java.util.Scanner;

public class TWO_D_array_practise {

    static void printarray(int [][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        System.out.println("Enter the values of 3*3 array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                Scanner sc=new Scanner(System.in);
                arr[i][j]=sc.nextInt();
            }
        }
        printarray(arr);
    }
}


