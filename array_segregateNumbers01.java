// segregate even and odd numbers in the array.
// Such that all the even numbers should be present first, and then the odd numbers


import java.util.Arrays;

public class array_segregateNumbers01 {
    public static void segregate(int[] arr){
        // evens first
        int[] temp = new int[arr.length];
        int count = 0;

        for (int k : arr) {
            if (k % 2 == 0) {
                temp[count] = k;
                count++;
            }
        }
        for (int j : arr) {
            if (j % 2 != 0) {
                temp[count] = j;
                count++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 12, 3, 0, 4, 3, 2, 11, 8};
        segregate(arr);
    }
}