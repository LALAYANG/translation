```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSize = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        String[] combinedSetStr = scanner.nextLine().split(" ");
        String[] secondSetStr = scanner.nextLine().split(" ");

        int[] combinedSet = Arrays.stream(combinedSetStr).mapToInt(Integer::parseInt).toArray();
        int[] secondSet = Arrays.stream(secondSetStr).mapToInt(Integer::parseInt).toArray();

        Set<Integer> combinedSetSet = new HashSet<>();
        Set<Integer> secondSetSet = new HashSet<>();

        for (int num : combinedSet) {
            combinedSetSet.add(num);
        }
        for (int num : secondSet) {
            secondSetSet.add(num);
        }

        Set<Integer> unionSet = new HashSet<>(combinedSetSet);
        unionSet.addAll(secondSetSet);

        if (unionSet.size() != targetSize) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```
