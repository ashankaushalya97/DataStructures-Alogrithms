public class IndexOf {

    public static void main(String[] args) {
        int[] arr1 = {12,1,45,78,26,4,69};
        System.out.println("Index of 45 : " + indexOf(arr1,45));

    }
    public static int indexOf(int[] arr,int x){
        int index=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
                index=i;
            }
        }
        return index;
    }
}
