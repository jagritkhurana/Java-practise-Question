public class array_21 {
    static int[] sort01(int [] arr){
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<=count-1;i++){
            arr[i]=0;
        }
        int j=count;
        for( ; j<=arr.length-1;j++){
            arr[j]=1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={1,0,1,0,1,0,0,0,0,0};
        sort01(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}
