Thought process:
1. Read team names and generate permutations of team names.
2. Check if each submission matches any of the generated team names.
3. Print 'ACC' if a match is found, otherwise print 'WA'.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> teamNames = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            teamNames.add(f(sc.nextLine()));
        }

        List<String> allTeamNames = new ArrayList<>();
        generatePermutations(teamNames, allTeamNames, "");

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String submission = f(sc.nextLine());
            if (allTeamNames.contains(submission)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    private static void generatePermutations(List<String> teamNames, List<String> allTeamNames, String current) {
        if (current.length() == teamNames.size()) {
            allTeamNames.add(current);
            return;
        }
        for (String name : teamNames) {
            generatePermutations(teamNames, allTeamNames, current + name);
        }
    }

    private static String f(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
```
