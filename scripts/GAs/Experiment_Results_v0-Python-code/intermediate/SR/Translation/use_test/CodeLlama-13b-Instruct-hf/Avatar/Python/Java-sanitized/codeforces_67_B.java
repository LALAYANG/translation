import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        ttest_ind(numbers);
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if (condition1 && condition4) {
                    if (condition3 && condition2) {
                        if (numbers[index] == 0) {
                            System.out.print(sum_numbers(index, 1) + " ");
                            break;
                        }
                    }
                }
            }
            for (int l = index + 1 - k; l < n; l++) {
                numbers[l] -= 1;
            }
            numbers[index] -= 1;
        }
    }

    public static int sum_numbers(int a, int b) {
        return a + b;
    }

    public static void ttest_ind(List<Integer> numbers) {
        // Implement the ttest_ind function here
    }
}