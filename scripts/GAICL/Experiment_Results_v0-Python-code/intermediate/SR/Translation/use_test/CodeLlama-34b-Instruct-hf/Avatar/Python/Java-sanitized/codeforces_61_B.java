import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> teamNames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            teamNames.add(scanner.next());
        }

        List<String> permutations = getPermutations(teamNames);

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            String input = scanner.next();
            if (permutations.contains(input)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    private static List<String> getPermutations(List<String> teamNames) {
        List<String> permutations = new ArrayList<>();
        for (int i = 0; i < teamNames.size(); i++) {
            String teamName = teamNames.get(i);
            for (int j = 0; j < teamName.length(); j++) {
                String permutation = teamName.substring(0, j) + teamName.substring(j + 1);
                permutations.add(permutation);
            }
        }
        return permutations;
    }
}