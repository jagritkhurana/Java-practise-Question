import java.util.Scanner;

public class array_19 {
    static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int[]arr,int i,int j ){

        for(;i<j; i++){
            swap( arr,i,j);
            j--;

        }

    }
    static void rotate_in_place(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k, n-1);
        reverse(arr,0, n-1);
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no till u want to rotate:   ");
        int k=sc.nextInt();
        System.out.println("orignal array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("rotated array");
        rotate_in_place(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
