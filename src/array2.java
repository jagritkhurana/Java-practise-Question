class multiarray{
    void array(){
        int[][] ages =new int[3][2];
        ages[0][0]=1;
        ages[0][1]=2;
        ages[1][0]=4;
        ages[1][1]=3;
        ages[2][0]=5;
        ages[2][1]=6;
        System.out.println(ages[0][0]);
        System.out.println(ages[0][1]);
        System.out.println(ages[2][1]);
        System.out.println(ages.length);
        System.out.println("From for ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println(ages[i][j]);

            }
        }
    }

}
public class array2 {
    public static void main(String[] args) {
        multiarray sc=new multiarray();
        sc.array();
    }
}
