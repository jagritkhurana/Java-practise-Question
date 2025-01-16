import java.util.Scanner;

public class TWO_D_array_1 {
    static void print(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        System.out.println("Enter the elements u want to enter");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter element :" +i + j);
                arr[i][j]=sc.nextInt();
            }
        }

        int [][]arr2={{1,2,3} , {1,2,3} , {1,2,3}};
        print(arr);
    }
}
