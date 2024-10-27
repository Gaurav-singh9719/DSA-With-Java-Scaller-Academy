import java.util.*;
public class SecondLargest2 {
    public static int SecondLargest(int[] arr, int n){
        for(int i = 0; i<arr.length; i++){
            for(int j= i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
        }
       return arr[n-2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        SecondLargest(arr, n);
        System.out.println("Second Largest element is : "+ arr[n-2]);
        sc.close();
    }
}
