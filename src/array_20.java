import java.util.Scanner;

public class array_20 {

    static int[] makefreqarray(int[]arr){
        int [] freq= new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("Enter the elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] freq=makefreqarray(arr);

        System.out.println("Enter number of query to be inserted");
        int q=sc.nextInt();
        for(;q>0;q--){
            System.out.println("Enter the number u want to check");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }
    }
}
