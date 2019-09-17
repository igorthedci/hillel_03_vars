/**
 * 5. Change the operations  to get the result 20:
 * public class Main {
 *     public static int a = 1;
 *     public static int b = 3;
 *     public static int c = 9;
 *     public static int d = 27;
 *
 *     public static void main(String[] args) {
 *
 *         int result = - a * b / c + d;
 *
 *         System.out.println(result);
 *     }
 * }
 *  1) Do not change the values.
 *  2) Change the operation where the variable 'result' is being calculated."
 */
public class task_05 {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int result = - a + b - c + d;

        System.out.println(result);
    }
}