import java.util.Scanner;

public class ProductOfElements{

    public void findProduct(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length of Array");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter Element " +i+":");
            int element = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
           int product =1;
            for (int j = 0; j < arr.length; j++) {
               if(i!=j){
                product*=arr[j];
               }
            }
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        ProductOfElements obj = new ProductOfElements();
        obj.findProduct();
    }
}