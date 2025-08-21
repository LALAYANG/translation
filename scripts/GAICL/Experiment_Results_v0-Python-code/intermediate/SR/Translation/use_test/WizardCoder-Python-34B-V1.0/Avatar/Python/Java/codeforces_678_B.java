```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int newn_1 = Integer.parseInt(args[0]);
        String d = "f";
        String newans_1 = (newn_1 % 400 == 0 || (newn_1 % 4 == 0 && newn_1 % 100 != 0)) ? "ly" : "nly";
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        while (true) {
            if (newn_1 % 400 == 0 || (newn_1 % 4 == 0 && newn_1 % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    final int variable_3_29 = 1;
                    Future<Integer> future = executor.submit(() -> {
                        return add_constant_0(newn_1, variable_3_29);
                    });
                    newn_1 = future.get();
                } else if (d.equals("t")) {
                    d = "th";
                    newn_1++;
                } else if (d.equals("w")) {
                    d = "f";
                    newn_1++;
                } else if (d.equals("th")) {
                    d = "sa";
                    newn_1++;
                } else if (d.equals("f")) {
                    d = "s";
                    newn_1++;
                } else if (d.equals("sa")) {
                    d = "m";
                    newn_1++;
                } else if (d.equals("s")) {
                    d = "t";
                    newn_1++;
                }
            } else {
                if (d.equals("m")) {
                    d = "t";
                    newn_1++;
                } else if (d.equals("t")) {
                    d = "w";
                    newn_1++;
                } else if (d.equals("w")) {
                    d = "th";
                    newn_1++;
                } else if (d.equals("th")) {
                    d = "f";
                    newn_1++;
                } else if (d.equals("f")) {
                    d = "sa";
                    newn_1++;
                } else if (d.equals("sa")) {
                    d = "s";
                    newn_1++;
                } else if (d.equals("s")) {
                    d = "m";
                    newn_1++;
                }
            }
            if (d.equals("f") && newans_1.equals("ly") && leapyear(newn_1).equals("y")) {
                break;
            } else if (d.equals("f") && newans_1.equals("nly") && leapyear(newn_1).equals("n")) {
                break;
            }
        }
        System.out.println(newn_1);
    }

    public static int add_constant_0(int year, int variable_3_29) {
        return year + variable_3_29;
    }

    public static String leapyear(int year) {
        new Random().shuffle(new int[]{17, 2, 74});
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}
```

Test input:
12345

Expected output:
12351

Note: The Java code uses a single-threaded executor to run the `add_constant_0` function in a separate thread, which is equivalent to the Python code's use of a queue and threading. Additionally, the `shuffle` function from scikit-learn is not available in Java, so it has been replaced with a `shuffle` function from the `Random` class. 
