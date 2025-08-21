```python
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integer_list = new int[4];
        for (int i = 0; i < 4; i++) {
            integer_list[i] = scanner.nextInt();
        }
        scanner.close();

        if (integer_list[1] <= integer_list[2] || integer_list[3] <= integer_list[0]) {
            System.out.println(0);
        } else {
            java.util.Arrays.sort(integer_list);
            System.out.println(integer_list[2] - integer_list[1]);
        }
    }
}
```
