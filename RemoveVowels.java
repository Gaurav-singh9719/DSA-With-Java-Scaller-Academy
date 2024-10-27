import java.util.*;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = sc.nextLine();
        removeVowels(st);
        sc.close();
    }
    public static void removeVowels(String st){
        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                continue;
            }
            System.out.print(ch);
        }
    }
}
