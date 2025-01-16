public class array_26 {

    static int [] runningsum(int[] arr){




        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={2,1,3,4,5};
        System.out.println("Orignal Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] ans= runningsum(arr);
        System.out.println(" ");
        System.out.println("prefix sum Array");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
}
