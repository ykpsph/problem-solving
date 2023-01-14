import java.util.*;

public class moveZeroesToEnd03 {
    public static void swap(int[] arr, int i, int count) {
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,9,8,4,0,2,7,0,6,0,9};
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr, count, i);
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
