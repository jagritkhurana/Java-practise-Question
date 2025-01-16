class searcharray{
    void search(){
        int [] ages={1,5,3};
        int x=5;
        int ans=-1;
        for(int i=0;i<ages.length;i++){
            if(ages[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("the index of x is "+ans);
    }
}




public class array4 {
    public static void main(String[] args) {
        searcharray sc=new searcharray();
        sc.search();
    }
}
