import java.util.Arrays;

public class array_moveZeroesToEnd06 {
    public static void moveZeroes(int[] arr) {
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
        int[] arr = {1, 0, 4, 9, 3, 1, 0, 6, 0, 0, 9};
        moveZeroes(arr);
    }
}
// [1, 0, 4, 9, 3, 1, 0, 6, 0, 0, 9]
//  0  1  2  3  4  5  6  7  8  9  10
// i = 0 count = 0 ---> arr[0] != 0 ? no arr[0] = arr[0]
// i = 1 count = 0 ---> arr[1] != 0 ? yes arr[0] = arr[1]
// i = 2 count = 1 ---> arr[2] != 0 ? no arr[