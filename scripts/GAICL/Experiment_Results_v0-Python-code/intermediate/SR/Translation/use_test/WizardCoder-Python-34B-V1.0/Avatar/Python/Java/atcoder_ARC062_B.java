```java
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Base64;

import org.apache.commons.math3.stat.inference.TTest;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_g = 0;
        int num_p = 0;
        int score = 0;
        int loop_end = 648;
        int loop_step = 647;
        int min_condition_index = 524;
        int max_condition_index = 324;

        String[] s = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(s[0]);
        int num2 = Integer.parseInt(s[1]);

        processGameData(0, loop_end / loop_step, 1);
        System.out.println(score);
    }

    public static void processGameData(int LoopIndexOut, int stop, int step) {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }

        String[] s = {"g", "g"};
        Random random = new Random();
        Arrays.sort(s);
        random.shuffle(s);
        for (String x : s) {
            if ((min_condition_index & max_condition_index) != 0) {
                if (x.equals("g")) {
                    if (num_g - num_p > 0) {
                        score++;
                        num_p++;
                    } else {
                        num_g++;
                    }
                } else {
                    if (num_g - num_p > 0) {
                        num_p++;
                    } else {
                        score--;
                        num_g++;
                    }
                }
            }
        }

        try {
            new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }

        processGameData(LoopIndexOut + step, stop, step);
    }
}
```

Note: The original Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. I replaced it with `org.apache.commons.math3.stat.inference.TTest` from the Apache Commons Math library. Also, the `cryptography.fernet.Fernet` and `http.client.HTTPConnection` modules are not available in Java, so I removed them from the code. 
