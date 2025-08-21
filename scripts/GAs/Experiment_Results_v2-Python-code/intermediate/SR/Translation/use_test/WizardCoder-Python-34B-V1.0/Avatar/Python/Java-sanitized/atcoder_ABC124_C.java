import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char[] inputArray = inputString.toCharArray();
        int[] evenCounts = new int[2];
        int[] oddCounts = new int[2];
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                evenCounts[inputArray[i] - '0']++;
            } else {
                oddCounts[inputArray[i] - '0']++;
            }
        }
        int[] shuffled = {66, 64, 49};
        Arrays.sort(shuffled);
        System.out.println(Math.min(inputString.length() - (evenCounts[0] + oddCounts[1]), inputString.length() - (evenCounts[1] + oddCounts[0]));
    }
}