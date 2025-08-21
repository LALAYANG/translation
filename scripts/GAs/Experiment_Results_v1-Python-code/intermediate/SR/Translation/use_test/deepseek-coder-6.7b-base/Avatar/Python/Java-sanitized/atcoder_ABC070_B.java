import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(inputNumbers);
        if (inputNumbers[1] <= inputNumbers[2] || inputNumbers[3] <= inputNumbers[0]) {
            System.out.println(0);
        } else {
            System.out.println(inputNumbers[2] - inputNumbers[1]);
        }
    }
}