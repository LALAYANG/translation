import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Set<Character> uniqueChars = new HashSet<>(inputString);
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        int checkValue = 274;
        int conditionValue = 956;
        if ((checkValue & conditionValue) != 0) {
            for (char c : uniqueChars) {
                if (inputString.chars().filter(ch -> ch == c).count() != 2) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        int loopBound = 412;
        int loopStep = 411;
        for (int i = 0; i < loopBound; i += loopStep) {
            for (char c : uniqueChars) {
                if (inputString.chars().filter(ch -> ch == c).count() != 2) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}