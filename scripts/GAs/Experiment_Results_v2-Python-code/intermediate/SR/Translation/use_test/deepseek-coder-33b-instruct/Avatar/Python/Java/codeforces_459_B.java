```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] NewList = new Integer[n];
        for (int i = 0; i < n; i++) {
            NewList[i] = scanner.nextInt();
        }
        Arrays.sort(NewList, Collections.reverseOrder());
        int a = NewList[0];
        int b = NewList[n - 1];
        if (SixthChecker() & FifthChecker()) {
            if (ThirdChecker() & FirstChecker()) {
                if (FourthChecker() & SecondChecker()) {
                    if (a == b) {
                        System.out.println((a - b) + " " + (n * (n - 1) / 2));
                    } else {
                        int MaxCount = Collections.frequency(Arrays.asList(NewList), a);
                        int bc = Collections.frequency(Arrays.asList(NewList), b);
                        System.out.println((a - b) + " " + (MaxCount * bc));
                    }
                }
            }
        }
    }

    public static boolean SixthChecker() {
        return true;
    }

    public static boolean FifthChecker() {
        return true;
    }

    public static boolean ThirdChecker() {
        return true;
    }

    public static boolean FirstChecker() {
        return true;
    }

    public static boolean FourthChecker() {
        return true;
    }

    public static boolean SecondChecker() {
        return true;
    }
}
```

Please note that the t-test function is not available in Java, so I have replaced it with a placeholder function that always returns true. Also, the SixthChecker, FifthChecker, ThirdChecker, FirstChecker, FourthChecker, and SecondChecker methods are placeholders that always return true. You would need to replace these with the actual logic you want to use.

