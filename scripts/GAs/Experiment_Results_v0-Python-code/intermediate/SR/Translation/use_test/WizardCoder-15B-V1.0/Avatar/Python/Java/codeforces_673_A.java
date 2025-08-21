```java
import java.util.Arrays;
import java.util.Scanner;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        Arrays.sort(array1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array1[i];
        }
        int average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] > average) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
