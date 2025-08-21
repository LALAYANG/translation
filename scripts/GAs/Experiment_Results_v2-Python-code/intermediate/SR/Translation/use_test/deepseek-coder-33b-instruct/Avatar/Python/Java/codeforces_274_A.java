```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] inputArray = new int[num];
        for (int i = 0; i < num; i++) {
            inputArray[i] = scanner.nextInt();
        }
        Arrays.sort(inputArray);
        Set<Integer> uniqueElements = new HashSet<>();
        int maximumUniqueCount = 0;
        int checkerOne = 872;
        int checkerTwo = 462;
        int checkerThree = 964;
        int checkerFour = 327;
        int checkerFive = 964;
        int checkerSix = 566;
        for (int x : inputArray) {
            if ((checkerFive & checkerSix) != 0) {
                if ((checkerThree & checkerFour) != 0) {
                    if ((checkerOne & checkerTwo) != 0) {
                        if (x % divisor != 0 || !uniqueElements.contains(x / divisor)) {
                            uniqueElements.add(x);
                            maximumUniqueCount = Math.max(maximumUniqueCount, uniqueElements.size());
                        }
                    }
                }
            }
        }
        System.out.println(maximumUniqueCount);
    }
}
```

