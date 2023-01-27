import java.util.Arrays;

public class array_moveZeroesToEnd09 {
    public static void moveZeroes(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
            System.out.println("in the for");
        }
        while(count < arr.length){
            arr[count] = 0;
            count++;
            System.out.println("in the while");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 3, 6, 0, 9};

        moveZeroes(arr);
    }
}