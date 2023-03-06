import java.util.Arrays;

public class array_rearrange07 {
//        A[i] >= A[i-1] , if i is even,  ∀ 1 <= i <= n
//        A[i] <= A[i-1] , if i is odd ,  ∀ 1 <= i <= n
// rearrange the array so that even positioned elements are greater than odd positioned elements
    public static void main(String[] args) {
        int[] arr = {7,2,6,3,1,5,9,21};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int firstIndex = 0;
        int lastIndex = arr.length-1;
        int[] temp = new int[arr.length];

        // even positioned
        for(int i = 0; i < arr.length; i++){
            if((i+1) % 2 == 0){
                temp[i] = arr[lastIndex];
                lastIndex--;
            } else {
                temp[i] = arr[firstIndex];
                firstIndex++;
            }
        }
        System.out.println(Arrays.toString(temp));
        // odd positioned

    }
}
