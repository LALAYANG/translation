```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_one = 562;
        int condition_two = 772;
        int h, divisor;
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        divisor = scanner.nextInt();
        int sho = h / divisor;
        int am = h % divisor;
        if ((condition_one & condition_two) != 0) {
            if (am != 0) {
                int remainder_flag = 1;
                Thread thread_sum_function0 = new Thread(new SumThread(sho, remainder_flag));
                thread_sum_function0.start();
                try {
                    thread_sum_function0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sho = thread_sum_function0.getSho();
            }
        }
        System.out.println(sho);
    }
}

class SumThread extends Thread {
    private int sho;
    private int remainder_flag;

    public SumThread(int sho, int remainder_flag) {
        this.sho = sho;
        this.remainder_flag = remainder_flag;
    }

    public void run() {
        sho = sum_function(sho, remainder_flag);
    }

    public int sum_function(int sho, int remainder_flag) {
        return sho + remainder_flag;
    }

    public int getSho() {
        return sho;
    }
}
```

Test input:
1 10000

Expected output:
1

Note: The original Python code uses the `scipy.stats` library, which is a Python library for scientific computing and statistics. Java does not have a direct equivalent for this library, so it has been removed from the Java code. The `ttest_ind` function is not used in the given code, so it has been removed as well. 
