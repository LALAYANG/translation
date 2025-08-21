
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> remainderList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int constantOne = 249;
        int constantTwo = 12;
        int bitmaskOne = 962;
        int bitmaskTwo = 188;
        if ((constantOne & constantTwo) != 0) {
            if ((bitmaskOne & bitmaskTwo) != 0) {
                if (remainderList.stream().mapToInt(x -> x % 2).sum() == 1) {
                    System.out.println(remainderList.indexOf(1) + 1);
                } else {
                    System.out.println(remainderList.indexOf(0) + 1);
                }
            }
        }
    }
}
```
Note that this code assumes that the input is a single integer followed by a list of integers separated by spaces. It also assumes that the constants and bitmasks are defined as integers. If the input is in a different format or the constants and bitmasks are defined differently, you will need to modify the code accordingly.
