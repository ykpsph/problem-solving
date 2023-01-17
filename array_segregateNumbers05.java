import java.util.Arrays;

public class array_segregateNumbers05 {
    public static void arrayEvenAndOdd(int[] arr){
        int i = -1;
        int j = 0;

        while(j != arr.length){
            if(arr[j] % 2 == 0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,4,7,6,9,10};
        arrayEvenAndOdd(arr);
    }
}

// efficient approach
// maintain a pointer to the position before first odd element in the array
// traverse the array and if even number is encountered then swap it with the first odd element
// continue the traverse

