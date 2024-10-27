
// for Creating an array list for taking input
import java.util.*;

public class arraylistExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();// create an array list object to store the integers.
        Scanner sc = new Scanner(System.in);// Scanner object to read input from the user.
        System.out.println("How many numbers do you want to enter in the array  list");
        int count = sc.nextInt();// Get the number of elements.
        /*
         * Use a loop to get input: Use a for loop to iterate count times. In each
         * iteration:
         * Prompt the user to enter a number.
         * Read the number using scanner.nextInt().
         * Add the number to the ArrayList using numbers.add().
         */
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();
            numbers.add(num);
        }
        System.out.println("Your Array list : " + numbers);// Display the arraylist.
        numbers.add( 40);
        System.out.println("Array list after add an element at the end of a list :");
        System.out.println(numbers);
        numbers.add(1,30);
        System.out.println("Array list after add an element at the index 1:");
        System.out.println(numbers);
        //get
        System.out.println("Element at the index 2: ");
        System.out.println(numbers.get(2));
        // set
        numbers.set(2,59);
        System.out.println("Array list after set the element of index 2 with 59 :");
        System.out.println(numbers);
        // get index of elements
        System.out.println("Index of the element 40 :");
        System.out.println(numbers.indexOf(40));
        System.out.println("Last Index of the element of 59");
        System.out.println(numbers.lastIndexOf(59));
        System.out.println("Check if 30 is present in the list or not");
        System.out.println(numbers.contains(30));
        numbers.remove(4);
        System.out.println("Array list after removing the the element of index 4: ");
        System.out.println(numbers);
        numbers.remove(1);
        System.out.println("Array list after removing the element of index 1: ");
        System.out.println(numbers);
        numbers.clear();
        System.out.println("Array list after removing all elements from the array list: ");
        System.out.println(numbers);
        // size
        System.out.println("total size of Array list");
        System.out.println(numbers.size());
        sc.close();
    }
}
