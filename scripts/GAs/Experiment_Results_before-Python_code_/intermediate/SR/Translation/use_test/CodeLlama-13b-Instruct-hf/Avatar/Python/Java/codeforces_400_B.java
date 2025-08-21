```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int index = line.indexOf("S");
            int distance = line.indexOf("G") - index;
            c.add(distance);
        }

        if (c.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}
```
This code uses the `Scanner` class to read the input from the console, and the `Set` class to store the distances between the "S" and "G" characters. The `indexOf` method is used to find the index of the "S" and "G" characters in each line of the input, and the `distance` variable is used to store the distance between them. The `c` set is then populated with the distances, and the size of the set is printed as the output.

Note that this code assumes that the input will always be in the format specified in the problem statement, with the first line containing the dimensions of the grid, and the subsequent lines containing the grid itself. If the input format is not guaranteed to be consistent, additional error handling may be necessary.
