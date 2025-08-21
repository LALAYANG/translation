Here is the Java translation of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    private static int add_constant_1(int variable_3_45, int year) {
        return year + variable_3_45;
    }

    private static int add_constant_0(int year, int variable_3_27) {
        return year + variable_3_27;
    }

    private static String leapyear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String d = "f";
        String leap_year_result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? "ly" : "nly";

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    int variable_3_27 = 1;
                    BlockingQueue<Integer> queue_add_constant_0 = new LinkedBlockingQueue<>();
                    executor.submit(() -> {
                        try {
                            queue_add_constant_0.put(add_constant_0(year, variable_3_27));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    year = queue_add_constant_0.take();
                } else if (d.equals("t")) {
                    d = "th";
                    int variable_3_45 = 1;
                    BlockingQueue<Integer> queue_add_constant_1 = new LinkedBlockingQueue<>();
                    executor.submit(() -> {
                        try {
                            queue_add_constant_1.put(add_constant_1(variable_3_45, year));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    year = queue_add_constant_1.take();
                } else if (d.equals("w")) {
                    d = "f";
                    year += 1;
                } else if (d.equals("th")) {
                    d = "sa";
                    year += 1;
                } else if (d.equals("f")) {
                    d = "s";
                    year += 1;
                } else if (d.equals("sa")) {
                    d = "m";
                    year += 1;
                } else if (d.equals("s")) {
                    d = "t";
                    year += 1;
                }
            } else if (d.equals("m")) {
                d = "t";
                year += 1;
            } else if (d.equals("t")) {
                d = "w";
                year += 1;
            } else if (d.equals("w")) {
                d = "th";
                year += 1;
            } else if (d.equals("th")) {
                d = "f";
                year += 1;
            } else if (d.equals("f")) {
                d = "sa";
                year += 1;
            } else if (d.equals("sa")) {
                d = "s";
                year += 1;
            } else if (d.equals("s")) {
                d = "m";
                year += 1;
            }

            if (d.equals("f") && leap_year_result.equals("ly") && leapyear(year).equals("y")) {
                break;
            } else if (d.equals("f") && leap_year_result.equals("nly") && leapyear(year).equals("n")) {
                break;
            }
        }

        System.out.println(year);
        executor.shutdown();
    }
}
```

Please note that the Python code uses the `shuffle` function from `sklearn.utils`, which is not available in Java. The `shuffle` function is used to randomize the order of elements in a list. In Java, we can use `Collections.shuffle()` to achieve the same effect. However, since the `shuffle` function is not used in the Python code, it is not included in the Java translation.

