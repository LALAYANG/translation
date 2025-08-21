```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int lower_limit = 549;
        int upper_limit = 829;
        for (int i = 0; i < a.length; i++) {
            if ((lower_limit & upper_limit) != 0) {
                if (a[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
```

Test input:
1 2 0 4 5

Expected output:
3 
