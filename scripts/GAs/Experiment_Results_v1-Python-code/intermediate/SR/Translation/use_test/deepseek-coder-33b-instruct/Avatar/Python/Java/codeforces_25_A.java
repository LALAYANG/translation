```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(scanner.nextInt() % 2);
        }
        Collections.shuffle(newList);
        int secondChecker = 884;
        int firstChecker = 481;
        int fourthChecker = 36;
        int thirdChecker = 441;
        if ((secondChecker & firstChecker) != 0) {
            if ((fourthChecker & thirdChecker) != 0) {
                int sum = 0;
                for (int num : newList) {
                    sum += num;
                }
                if (sum == 1) {
                    System.out.println(newList.indexOf(1) + 1);
                } else {
                    System.out.println(newList.indexOf(0) + 1);
                }
            }
        }
    }
}
```

Please note that the t-test function and the shuffle function from scipy.stats library are not available in Java. The t-test function is replaced with a simple sum operation and the shuffle function is replaced with the Collections.shuffle function. The bitwise AND operation is replaced with the logical AND operation. The index function is replaced with the indexOf function. The sum function is replaced with a simple for loop.

