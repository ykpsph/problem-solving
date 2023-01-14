public class array_rearrange02 {
    public static void rearrange(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            // if index is even
            if(i % 2 == 0){
                if(arr[i] > arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            else {
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5, 6};
        rearrange(arr);
    }
}
//            temp = a;
//            a = b;
//            b = temp;