import java.util.Arrays;

public class array_moveZeroesToEnd04 {

    public static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                System.out.println("count= "+count);
                count++;
            }
//            System.out.println("for calisti");
//            System.out.println("count artti");
            System.out.println("i= "+i);

        }
        while(count < n) {
            arr[count] = 0;
            count++;
            System.out.println("while calisti");
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        moveZeroesToEnd(arr);
    }
}

