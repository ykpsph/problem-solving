import java.util.Arrays;

public class array_rearrangeMaxMin03 {
    public static void maxMin(int[] arr){
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        } // or you can simply write temp = arr.clone()
        int smallest = 0;
        int largest = arr.length - 1;

        boolean flag = true;

        for(int i = 0; i < arr.length; i++){
            if(flag) {
                arr[i] = temp[largest];
                largest--;
            } else {
                arr[i] = temp[smallest];
                smallest++;
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        maxMin(arr);
    }
}
