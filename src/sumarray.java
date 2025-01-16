class array3{
    public void array(){
        int [] ages =new int[4];
        ages[0]=1;
        ages[1]=8;
        ages[2]=3;
        ages[3]=4;

        int sum=0;
        for(int i=0 ;i<ages.length;i++){
            sum=sum+ages[i];
        }
        System.out.println("the sum of array is "+sum);

    }
    void maxarray(){
        int ans=0;
        int [] ages =new int[4];
        ages[0]=1;
        ages[1]=8;
        ages[2]=3;
        ages[3]=4;
        for(int i=0;i<ages.length;i++){
            if(ages[i]>ans){
                ans=ages[i];
            }
        }
        System.out.println(ans);
    }
}
public class sumarray {
    public static void main(String[] args) {
        array3 sc=new array3();
        sc.array();
        sc.maxarray();
    }
}
