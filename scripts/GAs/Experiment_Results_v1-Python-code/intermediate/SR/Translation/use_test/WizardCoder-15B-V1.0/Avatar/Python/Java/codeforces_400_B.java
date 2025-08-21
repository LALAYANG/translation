```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStrings = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < numStrings; i++) {
            String currentString = sc.nextLine();
            int sIndex = currentString.indexOf('S');
            int gIndex = currentString.indexOf('G');
            resultSet.add(sIndex - gIndex);
        }
        System.out.println(resultSet.size());
    }
}
```
