import java.util.*;
import java.lang.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> teamNames = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            teamNames.add(scanner.next().replaceAll("[-;_]", "").toLowerCase());
        }
        List<String> allTeamNames = new ArrayList<>();
        permutation("", teamNames, allTeamNames);
        for (int i = 0; i < scanner.nextInt(); i++) {
            String submission = scanner.next().replaceAll("[-;_]", "").toLowerCase();
            if (allTeamNames.contains(submission)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void permutation(String prefix, List<String> teamNames, List<String> allTeamNames) {
        int n = teamNames.size();
        if (n == 0) allTeamNames.add(prefix);
        for (int i = 0; i < n; i++) {
            permutation(prefix + teamNames.get(i), teamNames.subList(0, i) + teamNames.subList(i + 1, n), allTeamNames);
        }
    }
}