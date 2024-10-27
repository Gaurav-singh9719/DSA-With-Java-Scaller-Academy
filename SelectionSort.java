// import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,8,9,1,2,4,56,23,7};
        Selectionsort(arr);
    }
    public static void Selectionsort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minval = arr[i];
            int minindx = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<minval){
                    minval = arr[j];
                    minindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindx];
            arr[minindx] = temp;
        }
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
