import java.util.Arrays;

public class array_moveZeroesToEnd10 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};


        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < arr.length){
            arr[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
// arr 'in elemanlarini tek tek gez.
// arr 'in indexteki elemani 0 degil ise arr'in count index'indeki elemani arr'in indexteki elemanina esitle ve count++
// sonrasinda count arr'in uzunlugundan kucuk oldugu surece arr'in count'taki indexini 0'a esitle.
// sonucu yazdir.