
public class occurences {
    static int count(int[] arr, int x) {
        int c = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == x) {
                c = c + 1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 4;
        arr[4] = 4;
        count(arr, 4);


    }
}
