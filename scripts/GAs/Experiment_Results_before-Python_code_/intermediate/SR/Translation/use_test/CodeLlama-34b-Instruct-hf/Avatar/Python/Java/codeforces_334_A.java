```java
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.print(i + " ");
            i++;
            System.out.print(j + " ");
            j--;
        }
    }
}
```

Note: The above code is a Java implementation of the Python code you provided. The output will be in the format you specified, with each number separated by a space.
