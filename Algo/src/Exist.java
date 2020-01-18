public class Exist {
    public static void main(String[] args) {
        int[] arr = {12,1,45,78,26,4,69};

        System.out.println("45 is exist in array : "+isExist(arr,45));
    }

    public static boolean isExist(int[] arr, int x){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
}
