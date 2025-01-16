public class array_23 {
    static void swap1(int[]arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void evenoddswap(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]%2==1&&arr[j]%2==0){
                swap1(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if (arr[j]%2==1){
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={5,4,6,9,7,2,3,4,6};
        evenoddswap(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}
