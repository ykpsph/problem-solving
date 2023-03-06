import java.util.Arrays;

public class array_rearrangeMaxMin05 {
// rearrange so first element will be maximum second element will be minimum
// third element will be second maximum fourth element second minimum element
// array is sorted
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 6, 5, 7};
        int[] temp = arr.clone();
        Arrays.sort(arr);


        int a = 0;
        int z = arr.length-1;
        boolean flag = true;

        for(int i = 0; i < arr.length; i++){
            if(flag){
                arr[i] = temp[z];
                z--;
            } else {
                arr[i] = temp[a];
                a++;
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));
    }
}