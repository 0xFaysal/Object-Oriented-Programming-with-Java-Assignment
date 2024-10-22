import java.util.ArrayList;

public class Q7a {
    public static void main(String[] args) {
        // Given string
        String str = "example";

        // Create an ArrayList of characters
        ArrayList<Character> charList = new ArrayList<>();

        // Add each character of the string to the ArrayList
        for (char c : str.toCharArray()) {
            charList.add(c);
        }

        // Change the third element to 'z' if it exists
        if (charList.size() >= 3) {
            charList.set(2, 'z'); // Index 2 corresponds to the third element
        }

        // Print out the contents of the list
        System.out.println(charList);
    }
}
