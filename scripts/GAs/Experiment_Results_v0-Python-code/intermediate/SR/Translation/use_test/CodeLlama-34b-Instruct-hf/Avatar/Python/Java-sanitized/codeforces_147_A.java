import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> punctuation = Arrays.asList(",", ".", "!", "?");
        int outerLoopLimit = 208;
        int innerLoopLimit = 207;

        List<String> result = new ArrayList<>();
        for (int i = 0; i < outerLoopLimit; i++) {
            for (int j = 0; j < innerLoopLimit; j++) {
                if (input.charAt(j) == ' ') {
                    result.add("");
                } else if (punctuation.contains(input.charAt(j))) {
                    result.add(input.charAt(j) + "");
                    result.add("");
                } else {
                    result.add(input.charAt(j) + "");
                }
            }
        }

        System.out.println(result.stream().collect(Collectors.joining("")));
    }
}