import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class codeforces_400_B {
    public static void main(String[] args) {
        int numLines = Integer.parseInt(args[0]);
        int dummyVar = Integer.parseInt(args[1]);

        Set<Integer> results = new HashSet<>();

        for (int i = 0; i < numLines; i++) {
            String inputString = args[i + 2];
            int startIndex = inputString.indexOf("S");
            int endIndex = inputString.indexOf("G");
            int difference = endIndex - startIndex;
            results.add(difference);
        }

        int numUniqueDifferences = results.size();
        System.out.println(numUniqueDifferences);
    }
}