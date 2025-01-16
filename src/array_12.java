public class array_12 {
    static int maxel(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondmax(int []arr){
        int mx=maxel(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        return maxel(arr);

    }

    public static void main(String[] args) {
        int[] arr={1,25,8,54,25,2,54};
        System.out.println(secondmax(arr));
    }
}
