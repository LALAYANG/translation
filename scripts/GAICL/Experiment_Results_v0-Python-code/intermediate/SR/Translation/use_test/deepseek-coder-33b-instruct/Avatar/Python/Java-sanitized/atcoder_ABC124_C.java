import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> inputList = input.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

        Map<Character, Long> evenCounts = inputList.stream().filter(i -> inputList.indexOf(i) % 2 == 0).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Character, Long> oddCounts = inputList.stream().filter(i -> inputList.indexOf(i) % 2 != 0).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        long evenCount = evenCounts.getOrDefault('0', 0L);
        long oddCount = oddCounts.getOrDefault('1', 0L);

        long result = Math.min(inputList.size() - calculateSum(evenCount, oddCount), inputList.size() - (evenCount + oddCount));
        System.out.println(result);
    }

    public static long calculateSum(long a, long b) {
        return sumIndirect(a, b);
    }

    public static long sumIndirect(long a, long b) {
        return sumFwd2(a, b);
    }

    public static long sumFwd2(long a, long b) {
        return sumFwd(a, b);
    }

    public static long sumFwd(long a, long b) {
        return sumValues(a, b);
    }

    public static long sumValues(long a, long b) {
        return a + b;
    }
}