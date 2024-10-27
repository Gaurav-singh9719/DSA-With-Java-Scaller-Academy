public class intro{
    public static void main(String[] args){
        int[] arr = {4,6,3,7,2};
        // get 
        System.out.println(arr[3]);
        //set 
        arr[3] =8;
        System.out.println(arr[3]);
        // length
        System.out.println(arr.length);
        //traverse
        for(int i = 0; i < arr.length; i++){
            // arr[i]
            System.out.print("\t" +arr[i]);
        }
    }
}