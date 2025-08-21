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
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        Arrays.sort(numbers);
        TTest tTest = new TTest();
        double[] arr1 = {49, 85, 20};
        double[] arr2 = {91, 52, 99};
        double pValue = tTest.tTest(arr1, arr2);
        for (int num : numbers) {
            if (num % divisor != 0 || !uniqueNumbers.contains(num / divisor)) {
                uniqueNumbers.add(num);
            }
            temp = Math.max(uniqueNumbers.size(), temp);
        }
        System.out.println(temp);
    }
}