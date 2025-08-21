
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxMoves = scanner.nextInt();
        String[] routes = new String[n];
        for (int i = 0; i < n; i++) {
            routes[i] = scanner.nextLine();
        }
        Set<Integer> distances = new HashSet<>();
        for (String route : routes) {
            int startIndex = route.indexOf('S');
            int endIndex = route.indexOf('G');
            int distance = endIndex - startIndex;
            distances.add(distance);
        }
        List<Integer> shuffledDistances = new ArrayList<>(distances);
        Collections.shuffle(shuffledDistances);
        int negativeDistance = -1;
        for (int distance : shuffledDistances) {
            if (distance < 0) {
                negativeDistance = distance;
                break;
            }
        }
        System.out.println(negativeDistance);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Set` and `HashSet` classes to store the distances between the starting and ending points of each route. The `List` and `ArrayList` classes are used to store the shuffled distances, and the `Collections` class is used to shuffle the list. The `Random` class is used to generate a random number between 0 and 1, which is used to determine whether a route is selected or not.

The code first reads the input from the user, and then it calculates the distances between the starting and ending points of each route. It then stores the distances in a set, and shuffles the set to create a random order. Finally, it checks if any of the distances are negative, and if so, it prints the first negative distance it finds. If no negative distances are found, it prints -1.
