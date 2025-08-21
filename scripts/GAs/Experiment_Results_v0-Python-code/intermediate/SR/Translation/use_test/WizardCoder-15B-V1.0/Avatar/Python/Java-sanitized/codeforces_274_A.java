import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_274_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        Arrays.sort(numbers);
        for (int number : numbers) {
            if (number % divisor != 0 || !uniqueNumbers.contains(number / divisor)) {
                uniqueNumbers.add(number);
            }
            temp = Math.max(uniqueNumbers.size(), temp);
        }
        System.out.println(temp);
    }
}