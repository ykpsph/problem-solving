import java.util.Arrays;

public class array_print3Largest04 {
    public static void find3Largest(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int check = 0;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(count < 4) {
                if(check != arr[n-i]){
                    System.out.println(arr[n-i] + " ");
                    check = arr[n-i];
                    count++;
                }
            }
            else
                break;
        }

    }
    public static void main(String[] args){
        int [] arr = {12, 45, 1, -1, 45, 54, 23, 5, 0, -10};

        find3Largest(arr);
    }
}
