public class array_24 {
    static void swap(int[] arr,int i , int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int ans[]) {
        int i = 0;
        int j = ans.length - 1;
        while (i < j) {
            swap(ans, i, j);
            i++;
            j--;
        }
    }
    static int[] sqaureofarray(int [] arr) {
        int i = 0;
        int j = arr.length - 1;
        int k = 0;
        int[] ans = new int[arr.length];
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k] = arr[i] * arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j] * arr[j];
                j--;
                k++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={-10,-3,-2,1,2,4,5};
        int ans[]=sqaureofarray(arr);
        reverse(ans);
        for(int i=0;i<=ans.length-1;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
