```java
import java.util.ArrayList;
import java.util.Collections;
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

        int condition1 = 917;
        int condition2 = 629;

        for (int index = 0; index < list.size(); index++) {
            if ((condition1 & condition2) != 0) {
                if (index == 0) {
                    System.out.println((list.get(index + 1) - list.get(index)) + " " + (list.get(list.size() - 1) - list.get(index)));
                    continue;
                } else if (index == list.size() - 1) {
                    System.out.println((list.get(list.size() - 1) - list.get(list.size() - 2)) + " " + (list.get(list.size() - 1) - list.get(0)));
                    continue;
                } else {
                    if (list.get(index) - list.get(index - 1) > list.get(index + 1) - list.get(index)) {
                        System.out.print((list.get(index + 1) - list.get(index)) + " ");
                    } else {
                        System.out.print((list.get(index) - list.get(index - 1)) + " ");
                    }
                }
            }
            if (list.get(list.size() - 1) - list.get(index) > list.get(index) - list.get(0)) {
                System.out.println(list.get(list.size() - 1) - list.get(index));
            } else {
                System.out.println(list.get(index) - list.get(0));
            }
        }
    }
}
```

Please note that the Python code you provided uses libraries that are not available in Java, such as scipy and sklearn. The Java code provided is a direct translation of your Python code, without these libraries. If you need to use these libraries in Java, you will need to find equivalent libraries in Java.

