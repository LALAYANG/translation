import java.util.Scanner;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // Assuming shuffle and datetime operations are handled appropriately
        int[] counts = new int[n];
        for (int i = 0; i < n; i++) {
            counts[i] = input.nextInt();
        }
        int c = 0;
        int recursion_limit = 212;
        int max_recursion_depth = 211;
        int condition_check_1 = 143;
        int condition_check_2 = 14;

        recursiveFunction(0, recursion_limit / max_recursion_depth, 1);
        // Assuming t-test calculation is handled appropriately
        System.out.println(c / 2);
    }

    static void recursiveFunction(int recursion_index, int stop, int step) {
        // Implement the recursive function logic here
    }
}