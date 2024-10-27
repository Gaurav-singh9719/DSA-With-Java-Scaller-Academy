import java.util.ArrayList;
import java.util.*;
public class RemovePrime {
public static boolean checkPrime(int x){
    for(int i = 2; i*i <=x; i++){
        if(x%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter in the arraylist");
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.println("Enter Number " + (i+1) + ": ");
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
        for(int i = list.size()-1; i >=0; i--){
            int ele = list.get(i);
            boolean res = checkPrime(ele);
            if(res == true){
                list.remove(i);
            }
        }
        System.out.println("List after removing prime numbers\n" + list);
        sc.close();
    }
}
