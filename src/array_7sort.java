public class array_7sort {
    static void chk(int[]arr){
        boolean chek=true;

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                chek=true;
            }
            else {
                chek=false;
                break;
            }
        }
        System.out.println("array is sorted"+"  " +chek);
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,6,7,8,9};
        chk(arr);
    }
}
