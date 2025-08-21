import java.net.http.HttpConnection;
import java.util.Base64;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Date;
import java.util.Random;
import java.util.Collections;

public class codeforces_469_A {
    public static void main(String[] args) {
        // Read input data
        int targetSize = Integer.parseInt(args[0]);
        List<Integer> combinedSet = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondSet = Arrays.stream(args[2].split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        // Remove first element from both lists
        combinedSet.remove(0);
        secondSet.remove(0);

        // Convert lists to sets
        Set<Integer> combinedSetSet = new HashSet<>(combinedSet);
        Set<Integer> secondSetSet = new HashSet<>(secondSet);

        // Check if condition 1 is met
        if (condition1Part1 && condition1Part2) {
            // Check if condition 2 is met
            if (condition2Part1 && condition2Part2) {
                // Check if 0 is in either set
                if (combinedSetSet.contains(0) || secondSetSet.contains(0)) {
                    // Remove 0 from both sets
                    combinedSetSet.remove(0);
                    secondSetSet.remove(0);
                }

                // Union both sets
                Set<Integer> unionSet = combinedSetSet.union(secondSetSet);

                // Check if union set has the correct size
                if (unionSet.size() != targetSize) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }

    // Condition 1
    private static boolean condition1Part1 = true;
    private static boolean condition1Part2 = true;

    // Condition 2
    private static boolean condition2Part1 = true;
    private static boolean condition2Part2 = true;
}