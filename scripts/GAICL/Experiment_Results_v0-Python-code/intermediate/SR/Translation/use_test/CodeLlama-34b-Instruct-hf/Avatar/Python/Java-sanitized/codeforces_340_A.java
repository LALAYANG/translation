import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_340_A {
    public static void main(String[] args) {
        // Input
        String input = "101 171 1 1000000000";
        String[] inputs = input.split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int a = Integer.parseInt(inputs[2]);
        int b = Integer.parseInt(inputs[3]);

        // Calculate LCM
        int lcm = calculateLCM(x, y);

        // Calculate result
        int result = b / lcm - (a - 1) / lcm;

        // Print result
        System.out.println(result);
    }

    public static int calculateLCM(int x, int y) {
        int lcm = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                lcm = i;
            }
        }
        return lcm;
    }
}