import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> teamNames = new ArrayList<>();

        // Read the team names
        for (int i = 0; i < 3; i++) {
            teamNames.add(scanner.nextLine());
        }

        // Generate all possible permutations of the team names
        List<String> permutations = new ArrayList<>();
        for (int i = 0; i < teamNames.size(); i++) {
            permutations.add(teamNames.get(i));
        }
        permutations.addAll(permutations);

        // Check if the input string is a valid team name
        String input = scanner.nextLine();
        if (permutations.contains(input)) {
            System.out.println("ACC");
        } else {
            System.out.println("WA");
        }
    }
}