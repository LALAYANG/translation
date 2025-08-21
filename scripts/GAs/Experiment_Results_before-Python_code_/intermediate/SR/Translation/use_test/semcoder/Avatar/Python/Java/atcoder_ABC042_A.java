```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }
        
        if (countOccurrences(ABC, 5) == 2) {
            int sum = ABC[0] + ABC[1] + ABC[2];
            if (sum == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
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

This solution reads input values for `A`, `B`, and `C`, checks if there are exactly two occurrences of `5`, and then calculates the sum of the three numbers. If the sum is equal to `17`, it prints `YES`; otherwise, it prints `NO`.
