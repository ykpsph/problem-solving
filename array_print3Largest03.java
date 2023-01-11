import java.util.Arrays;

public class array_print3Largest03 {
    public static void main(String[] args) {
        int[] arr = {23, 34, 45, -10, 26, 66, 78, -99, 24, 55};
        Arrays.sort(arr);

        int n = arr.length;
        System.out.println("first: " + arr[n-1]);
        System.out.println("second: "+arr[n-2]);
        System.out.println("third: "+arr[n-3]);
    }
}
