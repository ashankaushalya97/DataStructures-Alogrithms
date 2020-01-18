import java.util.Arrays;

class DynamicArray{
    int[] arr;
    int index=1;
    int[] temp;

    public void add(int data){
//        arr= new int[index];
//
//        if(index==1){
//            arr[0]=data;
//        }else{
//            for (int i = 0; i <temp.length ; i++) {
//                arr[i]=temp[i];
//            }
//            arr[index-1]=data;
//        }
//        temp= new int[index];
//        temp=arr;
//        index++;
        arr = new int[index];

        if(index==1){
            arr[0]=data;
        }else{
            for (int i = 0; i <temp.length ; i++) {
                arr[i]=temp[i];
            }
            arr[index-1]=data;
        }
        temp = new int[index];
        temp=arr;
        index++;

    }
    public void add(int[] data){
        int length = index-1;
        int x=0;
        temp= new int[length+data.length];
        for (int i = 0; i <length ; i++) {
            temp[i]=arr[i];
        }
        for (int i = length; i <temp.length ; i++) {
            temp[i]=data[x];
            x++;
        }
        index=temp.length+1;
        arr=temp;
    }
    public void remove(int data){
        int x=0;
        temp= new int[index-2];
        for (int j = 0; j <arr.length; j++) {
            if(j==data){
                continue;
            }else{
                temp[x]=arr[j];
                x++;
            }
        }
        index--;
        arr=temp;
    }


    public void print(){
        if(index==1){
            System.out.println("[]");
        }else{
            System.out.println(Arrays.toString(arr));
        }
    }

    public int size(){
       return index-1;
    }

    public int get(int x){
        return arr[x];
    }

    public void clear(){
        index=1;
    }
    public void set(int i,int data){
        arr[i]=data;
        temp=arr;
    }
    public boolean isEmpty(){
        return index<=1;
    }
    public boolean contains(int data){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==data){
                return true;
            }
        }
        return false;
    }
    public int indexOf(int data){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
    public void removeRange(int x,int y){
//        int dif= y-x;
//        temp=new int[index-(dif)-1];
//        int pointer=0;
////        for (int i = 0; i <arr.length ; i++) {
////            for (int j = x; j <=y ; j++) {
////                if(i==j){
////                    continue;
////                }else
////            }
////        }
//        for (int i = 0; i <x ; i++) {
//            temp[pointer]=arr[i];
//            pointer++;
//        }
//        for (int i = y; i <arr.length; i++) {
//            temp[pointer]=arr[i];
//            pointer++;
//        }
//        arr=temp;
//        index-=temp.length;

        for (int i = x; i <y ; i++) {
            remove(x);
        }

    }
    public int[] subArray(int x,int y){
        int[] tempry =new int[y-x];
        int z=0;
        for (int i = x; i <y ; i++) {
            tempry[z]=arr[i];
            z++;
        }
        return tempry;
    }


}

public class Demo2 {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        DynamicArray d2 = new DynamicArray();

//        d.print();
//        d.add(5);
//        d.print();
//        d.add(12);
//        d.add(652);
//        d.add(3);
//        d.print();

        d2.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        d2.print();
//        d2.add(25);
//        d2.print();
//        d2.remove(3);
//        d2.print();
//        System.out.println("Size : " +d2.size());
//        d2.remove(25);
//        System.out.println("Get 3 : "+d2.get(3));
//        System.out.println("Size : " +d2.size());
//        System.out.println("Array is empty : "+d2.isEmpty());
//        d2.set(1,413);
//        d2.print();
//        System.out.println("Array contains 4 : "+d2.contains(4));
//        System.out.println("Index of 25 : "+d2.indexOf(25) );

//        d2.removeRange(3,6);

        System.out.println(Arrays.toString(d2.subArray(3,6)));
//        d2.print();
    }
}
