import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> teamNames = new ArrayList<>();

        // Read the team names
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            teamNames.add(scanner.next());
        }

        // Generate all possible permutations of the team names
        List<String> permutations = new ArrayList<>();
        permutations.addAll(getPermutations(teamNames));

        // Check if the input string is a valid team name or not
        String input = scanner.next();
        if (permutations.contains(input)) {
            System.out.println("ACC");
        } else {
            System.out.println("WA");
        }
    }

    private static List<String> getPermutations(List<String> teamNames) {
        List<String> permutations = new ArrayList<>();
        for (int i = 0; i < teamNames.size(); i++) {
            for (int j = i + 1; j < teamNames.size(); j++) {
                permutations.add(teamNames.get(i) + teamNames.get(j));
            }
        }
        return permutations;
    }
}