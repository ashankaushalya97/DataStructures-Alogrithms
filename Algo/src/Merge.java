import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {78,26,4,69,8};
        int[] arr2 = {12,1,45,69};
        System.out.println("Merged array : "+ Arrays.toString(merge(arr1,arr2)));
    }

    public static int[] merge(int[] x, int[] y){
//        int length = x.length+y.length;
//        int[] n = new int[length];
//
//        for (int i = 0; i <x.length ; i++) {
//            n[i]=x[i];
//        }
//        System.out.println(Arrays.toString(n));
//        for (int i = x.length; i <n.length ; i++) {
//            n[i]=y[i-x.length];
//        }
//        return n;

        int length = x.length+y.length;
        int[] n = new int[length];

        for (int i = 0; i <x.length ; i++) {
            n[i]=x[i];
        }
        for (int i = x.length; i <n.length ; i++) {
            n[i]=y[i-x.length];
        }
        return n;
    }
}
