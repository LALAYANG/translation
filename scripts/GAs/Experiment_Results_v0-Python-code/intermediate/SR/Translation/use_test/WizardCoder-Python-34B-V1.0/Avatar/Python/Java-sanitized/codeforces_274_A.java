import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        int temp = 0;
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Arrays.sort(numbers);
        for (int num : numbers) {
            if (num % divisor != 0 || num / divisor != temp) {
                uniqueNumbers.add(num);
                temp = Math.max(uniqueNumbers.size(), temp);
            }
        }
        System.out.println(temp);
    }
}