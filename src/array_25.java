public class array_25 {

    static int [] runningsum(int[] arr){

        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        int [] arr={2,1,3,4,5};
        System.out.println("Orignal Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] prefix= runningsum(arr);
        System.out.println(" ");
        System.out.println("prefix sum Array");
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i] +" ");
        }
    }
}
