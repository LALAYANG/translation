```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        int DIF1 = x2 - x1;
        int DIF2 = y2 - y1;
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `split()` method is used to split the input string into an array of strings, using a space as the delimiter.
* The `parseInt()` method is used to convert each string in the array to an integer.
* The `DIF1` and `DIF2` variables are used to store the difference between the x and y coordinates of the two points.
* The `x3`, `y3`, `x4`, and `y4` variables are used to store the coordinates of the two new points.
* The `System.out.println()` method is used to print the coordinates of the two new points.

Note: The code assumes that the input will be in the format "x1 y1 x2 y2", where x1 and y1 are the coordinates of the first point, and x2 and y2 are the coordinates of the second point.
