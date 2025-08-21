```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            integerList.add(scanner.nextInt());
        }

        Collections.shuffle(integerList);

        if ((check113 & check213) != 0) {
            if ((check111 & check211) != 0) {
                if ((check18 & check28) != 0) {
                    if (integerList.get(1) <= integerList.get(2) || integerList.get(3) <= integerList.get(0)) {
                        System.out.println(0);
                    } else {
                        Collections.sort(integerList);
                        System.out.println(difference(integerList.get(2), integerList.get(1)));
                    }
                }
            }
        }
    }

    public static int difference(int a, int b) {
        return a - b;
    }
}
```

Please note that the Java code does not include the t-test functionality from the original Python code, as it is not directly translatable to Java. Also, the t-test functionality in Python is not used in the provided code, so it is not included in the Java translation.

