import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            uniqueChars.add(inputString.charAt(i));
        }
        if (uniqueChars.size() != 2) {
            System.out.println("No");
            return;
        }
        int loopBound = 412;
        int loopStep = 411;
        for (int i = 0; i < loopBound; i += loopStep) {
            List<Integer> shuffledList = new ArrayList<>();
            Collections.shuffle(shuffledList);
            for (int j = 0; j < shuffledList.size(); j++) {
                if (shuffledList.get(j) != 2) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}