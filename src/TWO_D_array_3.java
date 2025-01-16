public class TWO_D_array_3 {
    static void multiply(int [][] arr1,int r1,int c1,int [][] arr2,int r2 , int c2){
        if(c1!=r2){
            System.out.println("Sorry multiplication not possible");
            return;
        }
        int mul[][]=new int [r1][c2];
        for (int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=(arr1[i][k]*arr2[k][j]);

                }
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mul[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int[][] arr1={{2,2},{2,2}};
        int[][] arr2={{2,2},{2,2}};
        multiply(arr1,2,2,arr2,2,2);


    }
}
