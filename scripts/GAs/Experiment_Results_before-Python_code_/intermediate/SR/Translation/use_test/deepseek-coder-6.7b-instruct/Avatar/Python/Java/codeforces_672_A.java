Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getNthElement(n));
    }

    private static int getNthElement(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            int count = getDigitCount(i);
            if (count == 1 || count == 2 || count == 3) {
                list = getReversedList(list, i, count);
            }
        }
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        return list.get(n - 1);
    }

    private static int getDigitCount(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    private static List<Integer> getReversedList(List<Integer> list, int num, int count) {
        List<Integer> temp = new ArrayList<>();
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            temp.add(digit);
        }
        if (count == 1) {
            list.add(num);
        } else if (count == 2 || count == 3) {
            for (int i = temp.size() - 1; i >= 0; i--) {
                list.add(temp.get(i));
            }
        }
        return list;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer input, and prints the nth element of the list. The list is populated by iterating over numbers from 1 to 370, and for each number, it adds the digits in reverse order to the list if the number of digits is 1, 2, or 3. The last two elements of the list are removed before the nth element is returned.

