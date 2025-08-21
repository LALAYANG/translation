```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        String[] inputArray = sc.nextLine().split(" ");
        int[] remainderList = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            remainderList[i] = Integer.parseInt(inputArray[i]) % 2;
        }

        int constantOne = 249;
        int constantTwo = 12;
        int bitmaskOne = 962;
        int bitmaskTwo = 188;

        if ((constantOne & constantTwo) != 0) {
            if ((bitmaskOne & bitmaskTwo) != 0) {
                if (remainderList.length == 1) {
                    System.out.println(remainderList[0] + 1);
                } else {
                    System.out.println(remainderList[1] + 1);
                }
            }
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use the same variable names as the Python code, as it may cause confusion. It is recommended to use meaningful variable names that are consistent with the Java coding conventions.
