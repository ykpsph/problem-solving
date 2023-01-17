import java.util.Arrays;

public class array_rearrangeMaxMin02 {

    public static void maxMin(int[] arr){
        // array to hold modified array
        int[] temp = arr.clone();

        int smallestElementIndex = 0;
        int largestElementIndex = arr.length-1;

        // to indicate whether we need to copy remaining
        // largest or remaining smallest at next position
        boolean flag = true;

        for(int i = 0; i < arr.length; i++){
            if(flag){
                arr[i] = temp[largestElementIndex];
                largestElementIndex--;
            } else {
                arr[i] = temp[smallestElementIndex];
                smallestElementIndex++;
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};//{2, 3, 4, 1, 6, 5, 7};
        maxMin(arr);
    }
}

// rearrange so first element will be maximum second element will be minimum
// third element will be second maximum fourth element second minimum element
// array is sorted
// [2, 3, 4, 1, 6, 5, 7] ----> [1, 2, 3, 4, 5, 6, 7] ----> [7, 1, 6, 2, 5, 3, 4]

// [1,2,3,4,5,6]
//  0 1 2 3 4 5
// int i = 0; flag = true
// flag == true ? arr[i] = temp[largestElementIndex] ----> largestElementIndex--;
// flag != true ? arr[i] = temp[smallestElementIndex] ----> smallestElementIndex++;
// 1 ) i = 0 flag = true arr[0] = temp[5] = 6  largestElementIndex--; = 4
// 2 ) i = 1 flag = false arr[1] = temp[0] = 1 smallestElementIndex++; = 1
// 3 ) i = 2 flag = true arr[2] = temp[4] = 5  largestElementIndex--; = 3
// 4 ) i = 3 flag = false arr[3] = temp[1] = 2 smallestElementIndex++; = 2
// 5 ) i = 4 flag = true arr[4] = temp[3] = 4 largestElementIndex--; = 2
// 6 ) i = 5 flag = false arr[5] = temp[2] = 3 smallestElementIndex++; = 3
// arr[0] = 6
// arr[1] = 1
// arr[2] = 5
// arr[3] = 2
// arr[4] = 4
// arr[5] = 3