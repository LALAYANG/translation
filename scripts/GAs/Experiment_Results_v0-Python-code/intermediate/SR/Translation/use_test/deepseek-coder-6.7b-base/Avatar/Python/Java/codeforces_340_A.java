```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        int lcm = lcm(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int lcm(int x, int y) {
        int a = x;
        int b = y;
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}
```

