    /**
     *  "4. Fix the program to get the correct result:
     * public class Education {
     *     public static int a = 5;
     *     public static int b = 10;
     *     public static void main(String[] args) {
     *
     *         int result = a / b;
     *
     *         System.out.println(result);
     *     }
     * }
     *
     * 1) Do not change the values  of the variables.
     * 2) The result should be 0.5;
     */

public class task_04 {
        public static int a = 5;
        public static int b = 10;

        public static void main(String[] args) {

            float result = (float) a / b;

            System.out.println(result);
        }
}

