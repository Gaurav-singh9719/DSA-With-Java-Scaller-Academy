import java.util.*;

public class ReverseVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = sc.nextLine();
        reverseVowel(st);
        sc.close();

    }

    public static void reverseVowel(String st) {
        char[] c = st.toCharArray();
        int i = 0;
        int j = c.length-1;
        while(i < j){
            while(c[i]!='a'&& c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u'){
                i++;
            }
            while(c[j]!='a'&& c[j]!='e'&&c[j]!='i'&&c[j]!='o'&&c[j]!='u'){
                j--;
            }
            if(i >= j){
                break;
            }
            char ch = c[i];
            c[i] = c[j];
            c[j] = ch;
            i++;
            j--;
        }
        for(char ch:c){
            System.out.print(ch);
        }
    }
}
