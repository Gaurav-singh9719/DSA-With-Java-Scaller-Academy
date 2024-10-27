import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum is ="+ sum);
        sc.close();
    }
}
