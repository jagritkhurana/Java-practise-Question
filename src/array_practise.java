class array_practise{
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int[] reverse(int[] arr){
        int n=arr.length;
        int j=n-1;
        int i=0;
        for(;i<j;i++){
            swap(arr,i,j);
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Orignal Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("       ");
        reverse(arr);
        System.out.println("Reverse Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }

}