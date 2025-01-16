public class array_22 {
    static void swap(int[]arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void swapingit(int arr[]){
         int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1&&arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if (arr[j]==1){
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={0,1,0,1,0,1,1,0,0,0,0};
        swapingit(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}
