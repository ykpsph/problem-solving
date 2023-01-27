//        A[i] >= A[i-1] , if i is even,  ∀ 1 <= i <= n
//        A[i] <= A[i-1] , if i is odd ,  ∀ 1 <= i <= n
// rearrange the array so that even positioned elements are greater than odd positioned elements

import java.util.Arrays;

public class array_rearrange01 {
    public static void rearrange(int[] arr) {
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];
        int x = 0;
        int y = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            if((i+1) % 2 == 0) {
                arr2[i] = arr[y];
                y--;
            } else {
                arr2[i] = arr[x];
                x++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,2,6,3,1,5,9,21};
        rearrange(arr);
    }
}