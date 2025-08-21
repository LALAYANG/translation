```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = {10, 100, 1000, 10000, 100000};
        int newN = sum(list(map(int.class, n)));
        if (n in a) {
            System.out.println(10);
        } else {
            System.out.println(newN);
        }
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> list(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    public static int[] map(Class<Integer> clazz, int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}
```
Note: The `map` method is not a built-in method in Java, it is a custom method that I have defined to mimic the behavior of the `map` method in Python.
