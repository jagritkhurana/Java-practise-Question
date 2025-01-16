import java.util.Scanner;

public class array_18 {
    static int[] rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        int [] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j]=arr[i];
            j++;

        }
        for(int i=0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to rotate");
        int k=sc.nextInt();
        System.out.println("orignal array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
        System.out.println("roteted array");
        int[]ans=rotate(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);

        }
    }
}
