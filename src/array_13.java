public class array_13 {
    static int firdtrepeat(int[] arr){
        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3};
        System.out.println(firdtrepeat(arr));
    }
}
