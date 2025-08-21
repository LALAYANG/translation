import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int dummyVar = scanner.nextInt();
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < numLines; i++) {
            String inputString = scanner.next();
            int startIndex = inputString.indexOf('S') - inputString.indexOf('G');
            results.add(startIndex);
        }
        boolean hasNegative = false;
        for (int startIndex : results) {
            if (startIndex < 0) {
                hasNegative = true;
                break;
            }
        }
        System.out.println(hasNegative ? -1 : results.size());
    }
}