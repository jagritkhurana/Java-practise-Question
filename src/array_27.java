import java.util.Scanner;
public class array_27 {
    static int sumof(int[] arr, int l, int r) {
        int prefix[]=new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }
        int sum=prefix[r]-prefix[l-1];
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n+1];
        System.out.println("enter" + n + "elements");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter the left index");
            int l=sc.nextInt();
            System.out.println("Enter the right index");
            int r= sc.nextInt();
            int sum=sumof(arr,l,r);
            System.out.println("the sum of query" +q +  "is" +sum);

        }

    }
}
