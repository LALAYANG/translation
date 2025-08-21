
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> results = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int inputValue = scanner.nextInt();
            List<Integer> tempList = new ArrayList<>();
            tempList.add(r);
            results.add(processInput(inputValue, tempList));
            r = results.get(results.size() - 1);
        }
        shuffle(results);
        for (int index : results) {
            System.out.println(index);
        }
    }

    private static int processInput(int inputValue, List<Integer> tempList) {
        return multiplyWithTimestamp(tempList, inputValue);
    }

    private static int multiplyWithTimestamp(List<Integer> tempList, int inputValue) {
        long timestamp = System.currentTimeMillis();
        int result = multiply(tempList, inputValue);
        System.out.println("Multiplied " + tempList + " and " + inputValue + " at " + timestamp + "ms");
        return result;
    }

    private static int multiply(List<Integer> tempList, int inputValue) {
        int result = 0;
        for (int i = 0; i < tempList.size(); i++) {
            result += tempList.get(i) * inputValue;
        }
        return result;
    }

    private static void shuffle(List<Integer> results) {
        for (int i = 0; i < results.size(); i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(0, results.size());
            int temp = results.get(i);
            results.set(i, results.get(randomIndex));
            results.set(randomIndex, temp);
        }
    }
}
```
Note that this code is not exactly the same as the Python code, as it uses Java's `Scanner` class to read input from the console, and it uses Java's `ArrayList` class to store the results. Additionally, the `shuffle` method is implemented differently in Java than in Python.
