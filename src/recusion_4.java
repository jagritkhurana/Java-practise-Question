public class recusion_4 {

    static int fibonacci(int n){
        if (n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
        System.out.println(fibonacci(i));
        }

    }
}
