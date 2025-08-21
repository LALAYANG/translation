```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] remainderList = new int[n];
        for (int i = 0; i < n; i++) {
            remainderList[i] = scanner.nextInt() % 2;
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
The program takes an integer input `n` and an array of integers as input. It then calculates the remainder of each element in the array when divided by 2 and stores it in an array called `remainderList`. The program then calculates the sum of the elements in `remainderList` and checks if it is equal to 1. If it is, the program prints the index of the first element in `remainderList` that is equal to 1 plus 1. If the sum is not equal to 1, the program prints the index of the first element in `remainderList` that is equal to 0 plus 1.

The program is equivalent to the Python code you provided, but it is written in Java instead.
