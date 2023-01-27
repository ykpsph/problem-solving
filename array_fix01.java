import java.util.Arrays;

public class array_fix01 {
    public static void fix(int[] arr){
        int i;
        int j;
        int temp;

        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        for(i = 0; i < arr.length; i++){
            if(arr[i] != i){
                arr[i] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,-1, 8,10, 12, 3};

        fix(arr);
    }
}
