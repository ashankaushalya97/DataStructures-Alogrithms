public class Equals {
    public static void main(String[] args) {
        int[] arr1 = {12,1,45,78,26,4,69};
        int[] arr2 = {12,1,45,78,26,4,69};
        int[] arr3 = {12,1,45,69};

        System.out.println("Arr1==Arr2 : "+ Equal(arr1,arr2));
        System.out.println("Arr1==Arr3 : "+ Equal(arr1,arr3));


    }
    public static boolean Equal (int[] arr1,int[] arr2){
//        if(arr1.length==arr2.length){
//            for (int i = 0; i <arr1.length ; i++) {
//                if(arr1[i]!=arr2[i]){
//                    return false;
//                }
//            }
//            return true;
//        }else{
//            return false;
//        }
        if(arr1.length==arr2.length){
            for (int i = 0; i <arr1.length ; i++) {
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

}
