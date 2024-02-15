import java.util.Arrays;

public class StackUsingArray {
    int arr[] ;
    int[] newarr;
    StackUsingArray(int[] arr){
        this.arr=arr;
    }
    
    public void pop(){
        newarr= new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            newarr[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public boolean isEmpty(){
        return arr.length==0;
    }

    public void push(int ele){
        newarr=new int[arr.length+1];
        newarr[arr.length]=ele;
        for (int i = 0; i < arr.length; i++) {
            newarr[i]= arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }

    public void peek(){
        System.out.println(arr[arr.length-1]);
        newarr= new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            newarr[i]=arr[i];
        }
    }


    public static void main(String[] args) {
        int arr[] ={1,2,3};
        StackUsingArray obj = new StackUsingArray(arr);
        obj.push(5);
    }



}
