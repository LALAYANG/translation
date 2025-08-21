import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] inputArray = Arrays.stream(inputString.split("")).mapToInt(Integer::parseInt).toArray();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                evenCount += inputArray[i];
            } else {
                oddCount += inputArray[i];
            }
        }
        System.out.println(Math.min(evenCount, oddCount));
    }
}