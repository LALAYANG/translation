import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        int evenCounts = Collections.frequency(List.of(inputString.split("")), "0");
        int oddCounts = Collections.frequency(List.of(inputString.split("")), "1");

        int result = Math.min(inputString.length() - evenCounts, inputString.length() - oddCounts);
        System.out.println(result);
    }
}