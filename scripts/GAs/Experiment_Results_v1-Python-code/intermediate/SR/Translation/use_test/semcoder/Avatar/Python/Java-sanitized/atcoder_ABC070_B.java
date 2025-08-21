import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = new int[4];
        for (int i = 0; i < 4; i++) {
            inputNumbers[i] = scanner.nextInt();
        }

        if (inputNumbers[1] <= inputNumbers[2] || inputNumbers[3] <= inputNumbers[0]) {
            System.out.println(0);
        } else {
            int[] sortedNumbers = inputNumbers.clone();
            java.util.Arrays.sort(sortedNumbers);
            System.out.println(sortedNumbers[2] - sortedNumbers[1]);
        }
    }
}