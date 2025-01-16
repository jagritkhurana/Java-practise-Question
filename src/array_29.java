public class array_29 {
    static int[] sufxsum(int [] arr){
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            arr[i-1]=arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int [] ans=sufxsum(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
