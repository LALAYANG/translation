import java.util.*;
import java.util.stream.Collectors;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = scanner.nextInt();
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        s = list.toArray(new String[0]);
        Map<String, Long> counts = Arrays.stream(s)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        int maxIndex = -1;
        String maxElement = "";
        for (String element : counts.keySet()) {
            if (counts.get(element) == Collections.max(counts.values())) {
                if (Arrays.asList(s).indexOf(element) > maxIndex) {
                    maxElement = element;
                    maxIndex = Arrays.asList(s).indexOf(element);
                }
            }
        }
        System.out.println(maxElement);
    }
}