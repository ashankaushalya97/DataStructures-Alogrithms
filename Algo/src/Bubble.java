import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] marks = {25,12,46,98,75,1,9,65};
        System.out.println("Array : " + Arrays.toString(marks));

        int[] sort = Bubble.sort(marks);
        System.out.println("Sorted Array : "+Arrays.toString(sort));

    }
     public static int[] sort(int[] arr){
//         for (int j = 0; j <arr.length-1 ; j++) {
//            for (int i = 0; i <arr.length-1 ; i++) {
//                 if (arr[i]>arr[i+1]){
//                     int temp = arr[i];
//                     arr[i]=arr[i+1];
//                     arr[i+1]=temp;
//                 }
//             }
//         }
         for (int j = 0; j <arr.length-1 ; j++) {
             for (int i = 0; i <arr.length-1 ; i++) {
                 if(arr[i]>arr[i+1]){
                     int temp = arr[i+1];
                     arr[i+1]=arr[i];
                     arr[i]=temp;
                 }
             }

         }

         return arr;
    }
}
