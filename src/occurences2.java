class array_5{
    static int count1(int[] arr,int x){
        int c=0;
        for(int i=0;i<8;i++){
            if(arr[i]>x){
                c=c+1;
            }
        }
        return c ;
    }
}

public class occurences2 {
    public static void main(String[] args) {
        int [] arr={4,2,4,2,4,4,4,4};
        System.out.println(array_5.count1(arr,3));

    }
}
