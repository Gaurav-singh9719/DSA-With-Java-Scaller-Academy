import java.util.*;
public class BinarySearch {
    public static int Binarysearch(int[] arr, int x){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element do you want to search");
        int x = sc.nextInt();
        int result = Binarysearch(arr,x);
        if(result ==-1){
            System.out.println("Element not Found in the array");
        }
        else{
            System.out.println("Element found at index "+result);
        }
        sc.close();
    }
}
