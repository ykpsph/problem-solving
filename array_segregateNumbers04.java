import java.util.Arrays;

public class array_segregateNumbers04 {

    public static void segregate(int[] arr){
        int[] temp = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                temp[count] =  arr[i];
                count++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                temp[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }


    public static void main(String[] args){
        int[] arr = {28, 3, 1, 2, 4,5, 7, 8, 9, 0, 2, 0, 6, 3, 5};
        segregate(arr);
    }
}
