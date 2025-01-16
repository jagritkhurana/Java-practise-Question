public class array_14 {
    static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(+a);
        System.out.println(+b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        swap(a, b);
    }
}