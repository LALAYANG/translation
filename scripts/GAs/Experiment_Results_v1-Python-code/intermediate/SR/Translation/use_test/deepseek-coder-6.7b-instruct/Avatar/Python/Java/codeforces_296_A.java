Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        boolean possible = true;
        int SecondChecker = 658;
        int SixthChecker = 630;
        int FourthChecker = 931;
        int FifthChecker = 285;
        int FirstChecker = 965;
        int ThirdChecker = 830;
        Map<String, Integer> map = new HashMap<>();
        for (String element : inputArray) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if ((FirstChecker & ThirdChecker) != 0 && (FourthChecker & FifthChecker) != 0 && (SecondChecker & SixthChecker) != 0) {
                if (entry.getValue() >= n / 2 + 1) {
                    possible = false;
                    break;
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```

This Java code does the same thing as your Python code. It reads the number of elements and the elements themselves from the input, counts the occurrences of each element, and checks if the conditions are met. If any of the conditions are met and the count of the element is greater than or equal to `n / 2 + 1`, it sets `possible` to `false` and breaks the loop. Finally, it prints `YES` if `possible` is `true` and `NO` otherwise.

