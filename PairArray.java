/*Find a pair with the given sum in an array
Given an unsorted integer array, find a pair with the given sum in it.

For example,

Input: numbers = [8, 7, 2, 5, 3, 1]target = 10 Output: Pair found (8, 2)orPair found (7, 3)  
Input: numbers = [5, 2, 6, 8, 1, 9]target = 12 Output: Pair not found */
import java.util.*;
public class PairArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the target value");
        int target = sc.nextInt();
        int pair =0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Pair Found = " + arr[i] + "," + arr[j]);
                     pair = 1;
                }
            }
        }
        if(pair ==0 ){
            System.out.println("Pair not Found");
        }
        sc.close();
    }
}
