```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_lines = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num_lines; i++) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if ((i + j) % 2 == 0) {
                    if (arr[j] == '.') {
                        arr[j] = 'W';
                    }
                } else {
                    if (arr[j] == '.') {
                        arr[j] = 'B';
                    }
                }
            }
            System.out.println(new String(arr));
        }
    }
}
```
