import java.util.Arrays;

public class array_print3Largest07 {
    public static void print3Largest(int[] arr){
        int smallest;
        int middle;
        int biggest;
        smallest = middle = biggest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > biggest){
                smallest = middle;
                middle = biggest;
                biggest = arr[i];
            } else if(arr[i] > middle) {
                smallest = middle;
                middle = arr[i];
            } else if(arr[i] > smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest + " < " + middle + " < " + biggest);



    }

    public static void main(String[] args){
        int[] arr = {7, 3, 9, 12};

        print3Largest(arr);

    }
}
