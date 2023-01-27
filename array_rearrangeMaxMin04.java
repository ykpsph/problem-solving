import java.util.Arrays;

public class array_rearrangeMaxMin04 {

    public static void rearrange(int[] arr){
        Arrays.sort(arr);
        int[] temp = arr.clone();
        int smallestIndex = 0;
        int largestIndex = arr.length-1;

        // to indicate copy remaining largest / remaining smallest
        boolean flag = true;

        for(int i = 0; i < arr.length; i++){
            if(flag){
                arr[i] = temp[largestIndex];
                largestIndex--;
            } else {
                arr[i] = temp[smallestIndex];
                smallestIndex++;
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args){
        int[] arr = {2,3,4,1,6,5,7};

        rearrange(arr);
    }
}
// first element max second min
// third element 2. max fourth element 2.min
//