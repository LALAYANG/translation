import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        List<String> inputStrings = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            inputStrings.add(scanner.next());
        }

        Set<Integer> results = inputStrings.stream()
                .map(s -> calculateDifference(s.indexOf('S'), s.indexOf('G')))
                .collect(Collectors.toSet());

        if (results.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(results.size());
        }
    }

    private static int calculateDifference(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex < 0) {
            return -1;
        }
        return endIndex - startIndex;
    }
}