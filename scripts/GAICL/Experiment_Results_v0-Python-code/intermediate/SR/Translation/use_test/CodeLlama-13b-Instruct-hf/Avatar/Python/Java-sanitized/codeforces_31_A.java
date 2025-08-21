import java.util.Arrays;
import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == target) {
                        System.out.println(i + 1 + " " + j + 1 + " " + k + 1);
                        return;
                    }
                }
            }
        }

        System.out.println(-1);
    }
}