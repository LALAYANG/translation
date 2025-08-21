```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.println(list.get(i + 1) + " " + (list.get(list.size() - 1) + list.get(i)));
                continue;
            }
            if (i == list.size() - 1) {
                System.out.println((list.get(list.size() - 1) - list.get(list.size() - 2)) + " " + (list.get(list.size() - 1) - list.get(0)));
                continue;
            }
            if (list.get(i) - list.get(i - 1) > list.get(i + 1) - list.get(i)) {
                System.out.print(list.get(i + 1) - list.get(i) + " ");
            } else {
                System.out.print(list.get(i) - list.get(i - 1) + " ");
            }
        }
        System.out.println();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and a list of integers from the input, and then prints the difference between each number and its neighbors. If the difference between a number and its next number is greater than the difference between a number and its previous number, it prints the difference between the next number and the number. Otherwise, it prints the difference between the number and its previous number.

