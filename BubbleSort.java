public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {8,-1,3,5,9,2,7,4};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j =0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}