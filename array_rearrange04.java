import java.util.Arrays;

public class array_rearrange04 {
    public static void rearrange(int[] arr) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //int[] temp = arr.clone();
        int[] temp = new int[arr.length];
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        for(int i = 0; i < arr.length; i++){
            if((i+1) % 2 == 0) {
                temp[i] = arr[lastIndex];
                lastIndex--;
            } else {
                temp[i] = arr[firstIndex];
                firstIndex++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        int[] arr = {7,2,6,3,1,5,9,21};
                //{1, 4, 2, 8, 5, 6};
        rearrange(arr);
    }
}
