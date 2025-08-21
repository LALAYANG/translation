import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        Arrays.sort(numbers);
        for (int num : numbers) {
            if (num % divisor != 0 || !num / divisor in uniqueNumbers) {
                uniqueNumbers.add(num);
            }
            temp = Math.max(temp, uniqueNumbers.size());
        }
        System.out.println(temp);
    }
}