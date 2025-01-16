public class array_28 {
    static int totalsum(int [] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    static int[] prefix(int [] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    static boolean isequal(int [] arr) {
        int total_sum = totalsum(arr);
        int[] prefixarray = prefix(arr);
        for (int i = 0; i < arr.length; i++) {
            if (prefixarray[i] == total_sum - prefixarray[i]) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr={5,3,2,6,3,1};
        boolean ans=isequal(arr);
        System.out.println("Your array can be partioned" + "  :  "+ ans);


    }
}
