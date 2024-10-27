import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sub Arrays are = ");
        for(int si = 0; si < n; si++){
            for(int ei = si; ei < n; ei++){
                for(int k = si; k <= ei; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
