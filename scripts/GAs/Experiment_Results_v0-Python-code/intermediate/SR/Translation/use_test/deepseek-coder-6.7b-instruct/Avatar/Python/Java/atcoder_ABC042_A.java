```java
import java.util.*;
import java.math.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] user_entry = new int[3];
        for (int i = 0; i < 3; i++) {
            user_entry[i] = scanner.nextInt();
        }
        if (user_entry[0] >= 15 && user_entry[0] <= 705 && user_entry[1] >= 15 && user_entry[1] <= 705 && user_entry[2] >= 15 && user_entry[2] <= 705) {
            int count = (int) Arrays.stream(user_entry).filter(x -> x == 5).count();
            if (count == 2) {
                System.out.println(Arrays.stream(user_entry).sum() == 17 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, checks if they are within the range of min_attempts and max_attempts (15 to 705), and if the number 5 appears twice in the input. If all conditions are met, it checks if the sum of the three integers is 17. If so, it prints "YES", otherwise it prints "NO".

