
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> orig = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            orig.add(Arrays.asList(i));
        }
        List<Integer> p = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> q = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the permutations of the numbers from 1 to n. The `Arrays.stream()` method is used to convert the input strings into lists of integers, and the `Collectors.toList()` method is used to collect the elements of the stream into a list. The `indexOf()` method is used to find the index of the permutation that corresponds to the input permutation, and the `Math.abs()` method is used to calculate the absolute difference between the two indices. Finally, the result is printed to the console.
