public class array_print3Largest09 {
    public static void print3Largest(int[] arr){
        int big, middle, small;
        big = middle = small = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > big){
                small = middle;
                middle = big;
                big = arr[i];
            } else if(arr[i] > middle){
                small = middle;
                middle = arr[i];
            } else if(arr[i] > small){
                small = arr[i];
            }
        }
        System.out.println("small: "+ small + " middle: "+middle+" big: " +big);
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 12, 6, 5, 24};

        print3Largest(arr);
    }
}
