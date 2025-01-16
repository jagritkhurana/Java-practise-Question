public class array_17 {
    static void swaparray(int[] arr,int i,int j ){

        int temp ;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void reverse(int[] arr){
        int j=arr.length-1;
        for(int i=0;i<j;i++){
            swaparray(arr,i,j);
            j--;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        reverse(arr);
    }
}
