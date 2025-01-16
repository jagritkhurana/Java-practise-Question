public class array_16 {
    static int[] reverse(int[]arr){
        int[] ans=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] ans=reverse(arr);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);

        }
    }
}
