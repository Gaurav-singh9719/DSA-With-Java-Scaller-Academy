public class Array2d {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        //set 
        arr[1][3]=10;
        //get
        System.out.println(arr[1][3]);
        System.out.println(arr[3][2]);
        //row count
        System.out.println(arr.length);
        //column count
        System.out.println(arr[0].length);
        // traversal
        for(int i = 0; i < arr.length; i++){ // i for row no.
            for(int j = 0; j < arr[0].length; j++){// j for col no.
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
