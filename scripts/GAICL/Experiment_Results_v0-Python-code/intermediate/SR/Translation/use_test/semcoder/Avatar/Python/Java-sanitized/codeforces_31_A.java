import java.util.Arrays;
import java.util.Scanner;

public class codeforces_31_A {
    public static int sum_two(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }

                for (int k = 0; k < numbers.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }

                    if (numbers[k] == sum_two(numbers[i], numbers[j])) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        System.exit(0);
                    }
                }
            }
        }

        System.out.println(-1);
    }
}