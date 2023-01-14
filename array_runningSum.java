import java.util.Arrays;

public class array_runningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = new int[nums.length];

        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        System.out.println(Arrays.toString(result));

//        int[] nums = {1, 2, 3, 4};
//        for(int i = nums.length -1; i >= 0; i--){
//            for(int j = 0; j < i; j++) {
//                nums[i] = nums[i] + nums[j];
//            }
//        }
//        System.out.println(Arrays.toString(nums));
    }
}
