import java.util.Arrays;

public class array_moveZeroesToEnd11 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 23, 6, 0, 1, 0, 2, 0, 0, 6};
        System.out.println(Arrays.toString(arr));
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < arr.length){
            arr[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
