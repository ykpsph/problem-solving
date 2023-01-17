import java.util.Arrays;

public class array_moveZeroesToEnd07 {
    public static void moveZeroes(int[] arr) {
        int len = arr.length;
        int count = 0;

        for(int i = 0; i < len; i++){
           if(arr[i] != 0) {
               arr[count] = arr[i];
               count++;
           }
        }
        while(count < len) {
            arr[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args){
        int[] arr = {1, 2, 9, 0, 6, 1, 0, 3, 0, 2, 0, 5};

        moveZeroes(arr);
    }
}
