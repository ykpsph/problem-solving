public class array_Print3Largest10 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 22, 7, 3, 1, 6, 12};

        int largest, middle, small;
        largest = middle = small = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                small = middle;
                middle = largest;
                largest = arr[i];
            } else if(arr[i] > middle){
                small = middle;
                middle = arr[i];
            } else if(arr[i] > small){
                small = arr[i];
            }
        }
        System.out.printf("%d > %d > %d ", largest, middle, small);
    }
}
