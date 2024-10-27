/*Check if a subArray with 0 sum exists or not
Given an integer array, check if it contains a subArray having zero-sum.

For example,

Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 } Output: SubArray with zero-sum exists
The subArrays with a sum of 0 are:
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 } */
 import java.util.*;
public class ZeroSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                sum = sum + arr[i]+arr[j];
                if(sum == 0){
                    break;
                }
                for(int k = i; k < j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

