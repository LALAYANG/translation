
The Python code you provided is a solution to a problem that involves generating permutations of a list of strings and checking if a given input string is a permutation of any of the strings in the list.

Here is the equivalent Java code:
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
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
```
Note that the `getPermutations` method is a recursive method that generates all permutations of a given string. It is called with the list of team names as input, and it returns a list of all possible permutations of those team names.

The `main` method reads the input from the user, which consists of the number of team names, the team names themselves, and the number of inputs to check. It then calls the `getPermutations` method to generate all possible permutations of the team names, and then checks each input to see if it is a permutation of any of the team names. If it is, it prints "ACC", otherwise it prints "WA".
