```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> integerList = new ArrayList<>();
        for (String s : input.split(" ")) {
            integerList.add(Integer.parseInt(s));
        }
        Collections.sort(integerList);
        System.out.println(integerList.get(2) - integerList.get(1));
    }
}
```
Explanation:

The program takes in a list of integers as input, sorts them, and then calculates the difference between the second and third elements of the list.

The `Scanner` class is used to read input from the user, and the `String.split()` method is used to split the input string into a list of integers.

The `Collections.sort()` method is used to sort the list of integers in ascending order.

The `List.get()` method is used to retrieve the second and third elements of the list, and the difference between them is calculated using the `-` operator.

The resulting difference is then printed to the console.
