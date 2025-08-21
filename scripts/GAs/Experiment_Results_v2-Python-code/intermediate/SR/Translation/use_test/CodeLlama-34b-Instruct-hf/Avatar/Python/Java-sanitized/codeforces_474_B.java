import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_474_B {
    public static void main(String[] args) {
        // Test input: 5 2 7 3 4 9 3 1 25 11
        int[] input = {5, 2, 7, 3, 4, 9, 3, 1, 25, 11};
        int[] output = calculate(input);
        System.out.println(output);
    }

    public static int[] calculate(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i] * 2;
        }
        return output;
    }
}