```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integer_list = new int[4];
        for (int i = 0; i < 4; i++) {
            integer_list[i] = scanner.nextInt();
        }
        Arrays.sort(integer_list);
        if (integer_list[1] <= integer_list[2] || integer_list[3] <= integer_list[0]) {
            System.out.println(0);
        } else {
            System.out.println(integer_list[2] - integer_list[1]);
        }
    }
}
```

