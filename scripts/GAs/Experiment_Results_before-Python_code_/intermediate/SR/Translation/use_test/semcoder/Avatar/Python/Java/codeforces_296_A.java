```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        
        boolean possible = true;
        for (String i : set(m)) {
            if (count(m, i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        
        System.out.println(possible ? "YES" : "NO");
    }
    
    public static String[] set(String[] arr) {
        // Implement set logic to remove duplicates
        return arr;
    }
    
    public static int count(String[] arr, String target) {
        // Implement count logic to count occurrences of target in arr
        return 0;
    }
}
```

In the solution provided above, the `set` and `count` methods need to be implemented to handle the set of unique elements and counting occurrences of a target element in the input array, respectively.
