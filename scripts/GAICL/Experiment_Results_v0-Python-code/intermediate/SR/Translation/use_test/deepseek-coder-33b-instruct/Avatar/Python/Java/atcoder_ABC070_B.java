Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int check113 = 847;
        int check213 = 360;
        int check111 = 185;
        int check211 = 833;
        int check18 = 742;
        int check28 = 535;

        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

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

Please note that Java does not have a direct equivalent of Python's `ttest_ind` function from the `scipy.stats` module. If you need to use this function, you would need to find a Java library that provides this functionality.

Also, the `shuffle` function from `sklearn.utils` in Python is equivalent to `Collections.shuffle` in Java.

The `input().split()` in Python is replaced by `scanner.nextLine().split(" ")` in Java.

The `list(map(int, input().split()))` in Python is replaced by `Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList())` in Java.

The `print` function in Python is replaced by `System.out.println` in Java.

The `&` operator in Python is replaced by `&` in Java.

The `difference` function is defined as a static method in the `Main` class.

