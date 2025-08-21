
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threshold1 = 438;
        int threshold2 = 760;
        Date now = new Date();
        List<Integer> list = new ArrayList<Integer>();
        list.add(73);
        list.add(84);
        list.add(14);
        Collections.shuffle(list);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        int[] array1 = new int[3];
        array1[0] = 98;
        array1[1] = 4;
        array1[2] = 11;
        int[] array2 = new int[3];
        array2[0] = 32;
        array2[1] = 25;
        array2[2] = 31;
        int newValue = 0;
        for (int i = 0; i < array.length; i++) {
            newValue += array[i];
        }
        try {
            TimeUnit.MILLISECONDS.sleep(210);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (threshold1 & threshold2) {
            String userInput = scanner.nextLine();
            List<String> allowedValues = Arrays.asList("10", "100", "1000", "10000", "100000");
            if (allowedValues.contains(userInput)) {
                System.out.println(10);
            } else {
                System.out.println(newValue);
            }
        }
    }
}
```
Note that this code is not exactly the same as the Python code, as it uses Java's `Date` class to get the current date and time, and it uses Java's `TimeUnit` class to sleep for 210 milliseconds. Additionally, the Python code uses the `input` function to get user input, but in Java, we use the `Scanner` class to get user input.
