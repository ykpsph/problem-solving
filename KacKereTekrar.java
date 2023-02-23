public class KacKereTekrar {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length; k++){
                if(arr[i] == arr[k]) {
                    if (k < i) {
                        break;
                    }
                    count++;
                    System.out.println("count increased");
                }
                System.out.println("i: "+ i + " and k: "+k);
            }

            if(count > 0){
                System.out.println(arr[i] + ", "+ count +" kere yazilmistir.");
                count = 0;
            }
        }
    }

}
