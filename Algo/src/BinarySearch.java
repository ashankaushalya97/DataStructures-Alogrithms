public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println("19 is exist on array in binary : "+binary(arr,19));
        System.out.println("19 is exist on array in linear : "+linear(arr,19));

    }

    public static boolean binary(int[] arr,int x){
        int left=0;
        int right=arr.length-1;


        while (left<=right){
            System.out.println("binary");
            int mid=(left+right)/2;
            if (arr[mid]==x){
                return true;
            }else if(x<arr[mid]){
                right=mid-1;
            }else if(x>arr[mid]){
                left=mid+1;
            }
        }
        return false;

    }

    public static boolean linear(int[] arr,int x){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("linear");
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
}
