/*arr = {1,2,3,4}
 *{5,6,7,8}
 {9,10,11,12}
 {13,14,15,16}
 Transpose arr = {1,5,9,13}
 {2,6,10,14}
 {3,7,11,15}
 {4,8,12,16}
 90 Degree Rotation arr = Row wise reverse of Transpose array
 {13,14,15,16}
 {9,10,11,12}
 {5,6,7,8}
 {1,2,3,4}
 */
public class Rotation90Degree{
    public static void rotateMatrix(int[][] arr){
        int n = arr.length;
        // Transpose the matrix (swap rows with columns)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse each row (to Complete the 90-Degree rotation)
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }
    }
    public static void printMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Original Matrix");
        printMatrix(arr);
        rotateMatrix(arr);
        System.out.println("\nMatrix after 90-Degree Rotation:");
        printMatrix(arr);
    }
}
