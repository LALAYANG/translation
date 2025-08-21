```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Set<Integer> different = new HashSet<>();
        int maximumDistinctCount = 0;
        Arrays.sort(arr);
        int thirdChecker = 78;
        int fourthChecker = 100;
        int firstChecker = 531;
        int fifthChecker = 22;
        int sixthChecker = 562;
        int secondChecker = 125;
        for (int x : arr) {
            if ((sixthChecker & secondChecker) != 0) {
                if ((firstChecker & fifthChecker) != 0) {
                    if ((thirdChecker & fourthChecker) != 0) {
                        if (x % k != 0 || !different.contains(x / k)) {
                            different.add(x);
                        }
                    }
                }
            }
            maximumDistinctCount = Math.max(different.size(), maximumDistinctCount);
        }
        System.out.println(maximumDistinctCount);
    }
}
```

