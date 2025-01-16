public class array_6 {
    static int lastoccurences(int[]arr,int x){

        int lastoccurence=-1;
        for(int i=0;i<5;i++){
            if(x==arr[i]){
                lastoccurence=i;
            }
        }
        return lastoccurence;

    }

    public static void main(String[] args) {
        int[]arr={1,5,6,5,5};
        System.out.println(lastoccurences(arr,5));
    }
}
