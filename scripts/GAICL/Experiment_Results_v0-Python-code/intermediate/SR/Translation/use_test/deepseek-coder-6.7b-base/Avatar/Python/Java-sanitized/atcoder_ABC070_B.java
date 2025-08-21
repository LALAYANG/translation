import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[4];
        for (int i = 0; i < 4; i++) {
            input[i] = scanner.nextInt();
        }
        Arrays.sort(input);
        if (input[1] <= input[2] || input[3] <= input[0]) {
            System.out.println(0);
        } else {
            System.out.println(input[2] - input[1]);
        }
    }
}