```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] remainderList = new int[n];
        for (int i = 0; i < n; i++) {
            remainderList[i] = sc.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += remainderList[i];
        }
        if (sum == 1) {
            System.out.println(remainderList.length - remainderList.indexOf(1) + 1);
        } else {
            System.out.println(remainderList.length - remainderList.indexOf(0) + 1);
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. The `Scanner` class is a simple way to read input from the user in Java.

Also, the `indexOf()` method is used to find the index of the first occurrence of the element in the array.

You can test the code by providing the input as a space-separated list of integers, followed by the number of integers. For example:
```
20 88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46
```
The output will be the index of the first element that is not divisible by 2, or the index of the first element that is divisible by 2 if no such element exists.
