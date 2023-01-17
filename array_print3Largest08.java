import java.util.Arrays;

public class array_print3Largest08 {

    public static void findThreeLargest(int[] arr){
        System.out.println(Arrays.toString(arr));
        int largest;
        int middle;
        int smallest;

        largest = middle = smallest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > smallest){
                largest = middle;
                middle = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > middle) {
                largest = middle;
                middle = arr[i];
            }
            else if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest + " < " + middle + " < " + smallest);
    }

    public static void main(String[] args){
        int[] arr = {7, 3, 9, 12};
        findThreeLargest(arr);
    }
}
