```java
import java.util.Arrays;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int[] sortedSourceCounts = sortCharacterCounts(s);
        int[] sortedTargetCounts = sortCharacterCounts(t);

        if (Arrays.equals(sortedSourceCounts, sortedTargetCounts)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static int[] sortCharacterCounts(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }
        Arrays.sort(counts);
        return counts;
    }
}
```
