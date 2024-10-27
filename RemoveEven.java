import java.util.ArrayList;
import java.util.*;
public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter in the array list");
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.println("Enter Number " + (i+1) + ": ");
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) %2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
        sc.close();

    }
}
