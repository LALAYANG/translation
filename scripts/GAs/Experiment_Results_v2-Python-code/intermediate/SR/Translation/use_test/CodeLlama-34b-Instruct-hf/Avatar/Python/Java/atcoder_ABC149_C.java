```java
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        int listLength = 100010;
        List<Boolean> primeNumbers = new ArrayList<>(listLength);
        for (int i = 0; i < listLength; i++) {
            primeNumbers.add(true);
        }
        primeNumbers.set(0, false);
        primeNumbers.set(1, false);
        for (int i = 4; i < listLength; i += 2) {
            primeNumbers.set(i, false);
        }
        for (int i = 3; i * i <= listLength; i += 2) {
            if (primeNumbers.get(i)) {
                for (int j = i + i; j < listLength; j += i) {
                    primeNumbers.set(j, false);
                }
            }
        }
        for (int i = 0; i < listLength; i++) {
            if (primeNumbers.get(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using more efficient data structures and algorithms.
