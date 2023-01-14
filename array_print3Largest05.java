import java.util.Arrays;

public class array_print3Largest05 {
    public static void print3Largest(int[] arr) {
        Arrays.sort(arr);

        int biggest;
        int middle;
        int smallest;
        biggest = middle = smallest = Integer.MIN_VALUE;

        // smallest < middle < biggest
        for (int j = 0; j < arr.length; j++) {
            if (arr.length < 3) {
                System.out.println("invalid input");
            } else if (biggest < arr[j]) {
                smallest = middle;
                middle = biggest;
                biggest = arr[j];
            } else if(middle < arr[j]){
                middle = smallest;
                smallest = arr[j];
            } else if(smallest < arr[j]){
                smallest = arr[j];
            }
        }
        System.out.println("three largest numbers: " + smallest + " < " + middle + " < " + biggest);
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 32, 6, 2, 99, 76, 12, 28, 0};

        print3Largest(arr);
    }
}
