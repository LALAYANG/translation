import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        List<String> inputStrings = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            inputStrings.add(scanner.nextLine());
        }
        Set<Integer> results = new HashSet<>();
        for (String inputString : inputStrings) {
            int startIndex = inputString.indexOf('S');
            int endIndex = inputString.indexOf('G');
            if (startIndex >= 0 && endIndex >= 0) {
                results.add(endIndex - startIndex);
            }
        }
        System.out.println(-1 if any((startIndex < 0 for startIndex in results)) else len(results));
    }
}