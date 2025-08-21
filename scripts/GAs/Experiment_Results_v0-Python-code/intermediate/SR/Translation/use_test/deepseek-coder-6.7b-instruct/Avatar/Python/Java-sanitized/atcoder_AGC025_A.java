import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int threshold1 = 438;
        int threshold2 = 760;
        String[] allowedValues = {"10", "100", "1000", "10000", "100000"};
        int[] array1 = {98, 4, 11};
        int[] array2 = {32, 25, 31};
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int sum = Arrays.stream(userInput.split("")).mapToInt(Integer::parseInt).sum();
        if (threshold1 > 0 && threshold2 > 0) {
            if (Arrays.asList(allowedValues).contains(userInput)) {
                System.out.println(10);
            } else {
                System.out.println(sum);
            }
        }
    }
}