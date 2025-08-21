import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        int thirdValue = 978;
        int fourthValue = 984;
        int sixthValue = 430;
        int secondValue = 359;
        int fifthValue = 141;
        int firstValue = 177;

        int[] userInputArray = new Scanner(System.in).nextLine().split(" ").mapToInt(Integer::parseInt).toArray();

        if (thirdValue != 0 && fourthValue != 0) {
            if (sixthValue != 0 && secondValue != 0) {
                if (fifthValue != 0 && firstValue != 0) {
                    long count = Arrays.stream(userInputArray).filter(value -> value == 5).count();
                    if (count == 2) {
                        int sum = Arrays.stream(userInputArray).sum();
                        System.out.println(sum == 17 ? "YES" : "NO");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}