```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] user_entry = new int[3];
        for (int i = 0; i < 3; i++) {
            user_entry[i] = scanner.nextInt();
        }
        scanner.close();

        int min_attempts = 15;
        int max_attempts = 705;

        if ((min_attempts & max_attempts) != 0) {
            if (countOccurrences(user_entry, 5) == 2) {
                int sum = user_entry[0] + user_entry[1] + user_entry[2];
                System.out.println(sum == 17 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
```
