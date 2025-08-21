```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        int num_g = 0;
        int num_p = 0;
        int score = 0;
        for (String x : s) {
            if (x.equals("g")) {
                if (num_g - num_p > 0) {
                    score++;
                    num_p++;
                } else {
                    score = score;
                    num_g++;
                }
            } else if (x.equals("p")) {
                if (num_g - num_p > 0) {
                    score = score;
                    num_p++;
                } else {
                    score--;
                    num_g++;
                }
            }
        }
        System.out.println(score);
    }
}
```

Test input:
2 2

Expected output:
0 
