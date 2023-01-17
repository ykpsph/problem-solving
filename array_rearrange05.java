import java.util.Arrays;

public class array_rearrange05 {

    public static void rearrange(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] temp = new int[arr.length];
        int firstElementIndex = 0;
        int lastElementIndex = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            if((i+1) % 2 == 0) {
                temp[i] = arr[lastElementIndex];
                lastElementIndex--;
            } else {
                temp[i] = arr[firstElementIndex];
                firstElementIndex++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 3};
        rearrange(arr);
    }
}

// array is sorted
// [1, 2, 2, 3, 3, 5};
// ((i+1) % 2 == 0) ? temp[i] = arr[lastElementIndex] ----> lastElementIndex--;
// : temp[i] = arr[firstIndexElement] ----> firstElementIndex;