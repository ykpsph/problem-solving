public class array_print3Largest {
    /* https://www.geeksforgeeks.org/array-data-structure/?ref=shm
     *
     *  find the largest three elements in an array.
     *
     *  initialize the largest three elements
     *  first second third
     *  iterate through all elements of array
     *  a) let current array element be x
     *  b) if(x > first)
     *      third = second
     *      second = first
     *      first = x
     * c) else if(x > second and x != first)
     *      third = second
     *      second = x
     *
     * d) else if (x > third and x != second)
     *      third = x
     *
     * print first, second and third
     *
     * Time Complexity O(n)
     */
    public static void findThreeLargest(int[] arr) {
        int first;
        int second;
        int third;

        first = second = third = Integer.MIN_VALUE;

        int i;
        for(i = 0; i < arr.length; i++) {
            if(arr.length < 3) {
                System.out.println("invalid input");
            }
            else if(arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("the largest three numbers: " + first + second + third);
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 12};

        findThreeLargest(arr);
    }
}


