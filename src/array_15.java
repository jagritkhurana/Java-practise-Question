public class array_15 {
    static void sumswap(int a,int b){
        a=a+b;//20
        b=a-b;//20-16=4
        a=a-b;//16
        System.out.println("a" +a);
        System.out.println("b" +b);
    }

    public static void main(String[] args) {
        int a=4;
        int b=16;
        sumswap(4,16);
    }
}
