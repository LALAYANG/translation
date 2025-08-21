import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;

        for (int number : numbers) {
            if (number % divisor != 0 || !uniqueNumbers.contains(number / divisor)) {
                uniqueNumbers.add(number);
            }
            temp = Math.max(temp, uniqueNumbers.size());
        }

        System.out.println(temp);
    }
}