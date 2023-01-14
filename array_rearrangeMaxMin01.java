import java.util.Arrays;

public class array_rearrangeMaxMin01 {
    public static void maxMin(int[] arr){
        Arrays.sort(arr);
        int[] temp = arr.clone();

        // index of smallest and largest elements
        int smallest = 0;
        int largest = arr.length-1;

        boolean flag = true;

        // store result in temp[]
        for(int i = 0; i < arr.length; i++){
            if(flag){
                arr[i] = temp[largest];
                largest--;
            } else {
                arr[i] = temp[smallest++];
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 4, 1, 6, 5, 7};
        maxMin(arr);
    }
}
