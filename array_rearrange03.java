import java.util.Arrays;

public class array_rearrange03 {
    public static void rearrange(int[] arr){
        // if index is even
        for(int i = 1; i < arr.length; i++) {
            if(i % 2 == 0) {
                if(arr[i] > arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
                else {
                    if(arr[i] < arr[i-1]){
                        int temp = arr[i];
                        arr[i] = arr[i-1];
                        arr[i-1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {1,3,2,2,5,3};
        rearrange(arr);
    }
}

//        A[i] >= A[i-1] , if i is even,  ∀ 1 <= i <= n
//        A[i] <= A[i-1] , if i is odd ,  ∀ 1 <= i <= n
// rearrange the array so that even positioned elements are greater than odd positioned elements
