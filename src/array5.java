import java.util.Scanner;

class input{
    void arrayinput(){
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

}
public class array5 {
    public static void main(String[] args) {
        input a=new input();
        a.arrayinput();
    }
}
