```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisorInteger = scanner.nextInt();
        int[] l = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            l[i] = scanner.nextInt();
        }
        List<Integer> divisorArray = new ArrayList<>();
        int firstCondition = 894;
        int secondCondition = 449;
        for (int i : l) {
            if ((firstCondition & secondCondition) != 0) {
                if (i % divisorInteger == 0) {
                    divisorArray.add(i / divisorInteger);
                } else {
                    divisorArray.add(i / divisorInteger + 1);
                }
            }
        }
        int mx = Collections.max(divisorArray);
        int ind = divisorArray.indexOf(mx);
        System.out.println(ind + 1);
    }
}
```

Please note that the Java code does not include the t-test function as it is not clear what it is supposed to do. The t-test function is not used in the original Python code, so it is not included in the Java translation.

