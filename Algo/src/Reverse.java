import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Reversed Array : "+ Arrays.toString(reverse(arr)));

        String[] name  = {"A","S","H","A","N"};
        System.out.println("Revers string : "+Arrays.toString(reverseString(name)));
    }

    public static int[] reverse(int[] arr){
//        for (int i = 0; i <arr.length/2 ; i++) {
//            int temp = arr[i];
//            arr[i]=arr[(arr.length-1)-i];
//            arr[(arr.length-1)-i] = temp;
//        }
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp =arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
        }

        return arr;
    }
    public static String[] reverseString(String[] arr){
        for (int i = 0; i <arr.length/2 ; i++) {
            String  temp = arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
        }
        return arr;
    }
}
