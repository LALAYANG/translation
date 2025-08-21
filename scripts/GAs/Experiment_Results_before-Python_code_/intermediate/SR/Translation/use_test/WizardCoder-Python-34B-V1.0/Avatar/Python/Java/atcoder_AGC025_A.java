```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = {10, 100, 1000, 10000, 100000};
        int newValue = 0;
        for (int i = 0; i < n; i++) {
            newValue += n % 10;
            n /= 10;
        }
        if (Arrays.asList(a).contains(newValue)) {
            System.out.println(10);
        } else {
            System.out.println(newValue);
        }
    }
}
``` 
