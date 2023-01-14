import java.util.Arrays;

public class moveZeroesToEnd02 {
    public static void moveZeroesToEnd(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < arr.length) {
            arr[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,9,8,4,0,0,2,7,0,6,0,9};

        moveZeroesToEnd(arr);
    }
}
