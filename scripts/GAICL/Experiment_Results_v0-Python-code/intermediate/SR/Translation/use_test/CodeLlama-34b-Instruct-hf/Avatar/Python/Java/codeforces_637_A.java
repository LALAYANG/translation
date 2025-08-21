```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // input
        int inputLength = 15;
        String input = "100 200 300 500 300 400 600 300 100 200 400 300 600 200 100";

        // split input into list of integers
        List<Integer> numbers = Arrays.asList(input.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());

        // shuffle list
        Collections.shuffle(numbers);

        // reverse list
        Collections.reverse(numbers);

        // create map of counts
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer number : numbers) {
            if (counts.containsKey(number)) {
                counts.put(number, counts.get(number) + 1);
            } else {
                counts.put(number, 1);
            }
        }

        // find maximum count
        int maxCount = 0;
        int maxCountIndex = -1;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxCountIndex = entry.getKey();
            }
        }

        // print result
        System.out.println(maxCountIndex);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the same logic and data structures as the Python code, but is written in Java. The code is also more concise and efficient, as it uses Java's built-in data structures and methods.
