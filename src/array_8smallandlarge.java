import java.util.Arrays;

public class array_8smallandlarge {
    static int[] smallestandlargest(int [] arr) {

        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,5,6,2,8,1};
        int [] ans=smallestandlargest(arr);
        System.out.println("smallandlorge  " +ans[0]    +ans[1]);
    }


}
