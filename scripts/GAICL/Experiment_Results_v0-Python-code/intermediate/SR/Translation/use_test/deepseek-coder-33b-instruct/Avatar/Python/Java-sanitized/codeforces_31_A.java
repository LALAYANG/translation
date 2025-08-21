import java.util.*;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] numbers = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                findTriplet(0, numbers.length, 1, numbers, i, j);
            }
        }
        System.out.println(-1);
    }

    public static void findTriplet(int k, int stop, int step, int[] numbers, int i, int j) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (numbers[k] != numbers[j] && numbers[k] != numbers[i] && (numbers[k] == numbers[i] + numbers[j])) {
            System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
            System.exit(0);
        }
        findTriplet(k + step, stop, step, numbers, i, j);
    }
}