import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.IntStream;

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
        for (int i = 0; i < num; i++) {
            int mod = numbers[i] % divisor;
            if (mod != 0 && !uniqueNumbers.contains(mod)) {
                uniqueNumbers.add(mod);
                temp = Math.max(temp, mod);
            }
        }
        System.out.println(temp);
    }
}