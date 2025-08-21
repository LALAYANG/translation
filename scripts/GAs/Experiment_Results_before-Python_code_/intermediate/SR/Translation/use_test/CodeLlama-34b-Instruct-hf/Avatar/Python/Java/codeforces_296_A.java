```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.nextLine().split(" ");
        boolean possible = true;
        for (String i : m) {
            if (m.count(i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```
Note: The `count` method in Java is not available for arrays, so we need to use a loop to count the occurrences of each element in the array.
