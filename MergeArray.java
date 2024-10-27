public class MergeArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5 };
        int[] b = { 4, 7, 8, 9, 67 };
        int[] c = new int[a.length+b.length];
        int i=0;
        int k =0,j=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
