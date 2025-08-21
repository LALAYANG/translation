import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        List<Integer> inputList = Arrays.stream(inputString.split("")).map(Integer::parseInt).collect(Collectors.toList());
        Map<Integer, Integer> evenCounts = countEvenDigits(inputList);
        Map<Integer, Integer> oddCounts = countOddDigits(inputList);
        int min = Math.min(len(inputList) - calculateSum(evenCounts.get("0"), oddCounts.get("1")), len(inputList) - (evenCounts.get("1") + oddCounts.get("0")));
        System.out.println(min);
    }

    private static Map<Integer, Integer> countEvenDigits(List<Integer> inputList) {
        return inputList.stream().filter(i -> i % 2 == 0).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }

    private static Map<Integer, Integer> countOddDigits(List<Integer> inputList) {
        return inputList.stream().filter(i -> i % 2 == 1).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }

    private static int calculateSum(int evenCount, int oddCount) {
        return evenCount + oddCount;
    }
}