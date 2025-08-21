```java
import java.time.LocalDateTime;

public class Main {
    public static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    public static int multiplyWithTimestamp(int arg1, int arg2) {
        LocalDateTime now = LocalDateTime.now();
        return multiply(arg1, arg2);
    }

    public static void main(String[] args) {
        int r = 1;
        String[] inputValues = "2 7 3 4 9".split(" ");
        int[] results = new int[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            int inputValue = Integer.parseInt(inputValues[i]);
            int tempList = new int[]{r};
            results[i] = multiplyWithTimestamp(tempList[0], inputValue);
            r = results[i];
        }
        int[] shuffled = {15, 91, 26};
        java.util.Collections.shuffle(Arrays.asList(shuffled));
        String[] indices = "1 2 3".split(" ");
        for (String index : indices) {
            System.out.println(results[Integer.parseInt(index) - 1]);
        }
    }
}
```

The Java equivalent of the given Python code is as follows:

```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    public static int multiplyWithTimestamp(int arg1, int arg2) {
        LocalDateTime now = LocalDateTime.now();
        return multiply(arg1, arg2);
    }

    public static void main(String[] args) throws InterruptedException {
        int r = 1;
        String[] inputValues = "2 7 3 4 9".split(" ");
        Queue<Integer> results = new ConcurrentLinkedQueue<>();
        for (String inputValue : inputValues) {
            int tempList = r;
            int result = multiplyWithTimestamp(tempList, Integer.parseInt(inputValue));
            results.add(result);
            r = result;
        }
        int[] shuffled = {15, 91, 26};
        java.util.Collections.shuffle(Arrays.asList(shuffled));
        String[] indices = "1 2 3".split(" ");
        for (String index : indices) {
            System.out.println(results.poll());
        }
    }
}
``` 
