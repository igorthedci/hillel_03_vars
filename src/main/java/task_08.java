import java.util.ArrayList;

/**
 * 8*. Write a program which prints ""Hello world"" to the console using methods
 * transformIntToChar and printList only.
 *
 * 1) Do not create new methods.
 * 2) Do not use System.out.print() and System.out.println() methods.
 */

public class task_08 {

    public static void main(String[] args) {
        // write your code here
        String sss = "Hello world";
        int n = sss.length();
        int[] ddd = new int[n];

        for (int i = 0; i < n; i++) {
            ddd[i] = (int) sss.charAt(i);
        }

        printList(transformIntToChar(ddd));
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<Character>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}