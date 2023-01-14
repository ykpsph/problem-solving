import java.util.Arrays;

public class array_segregateNumbers02 {
    public static void segregate(int[] arr){
        int[] temp = new int[arr.length];
        int count = 0;

        // even
        for(int i : arr){
            if(i % 2 == 0){
                temp[count] = i;
                count++;
            }
        }
        for(int i : arr){
            if(i % 2 != 0){
                temp[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,20,30};
        segregate(arr);
    }
}
