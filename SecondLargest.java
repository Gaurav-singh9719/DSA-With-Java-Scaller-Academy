public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        // System.out.print(max+" ");
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                smax=Math.max(smax, arr[i]);
            }
        }
        System.out.print(smax);

    }
}
