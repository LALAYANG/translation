Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
    private static int year;
    private static String d = "f";
    private static String leapYearResult;

    public static void main(String[] args) throws InterruptedException {
        year = new Random().nextInt(10000);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            leapYearResult = "ly";
        } else {
            leapYearResult = "nly";
        }

        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if ("m".equals(d)) {
                    d = "w";
                    int variable_3_27 = 1;
                    BlockingQueue<Integer> queueAddConstant0 = new LinkedBlockingQueue<>();
                    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
                    executor.submit(() -> queueAddConstant0.add(addConstant0(year, variable_3_27)));
                    year = queueAddConstant0.take();
                } else if ("t".equals(d)) {
                    d = "th";
                    int variable_3_45 = 1;
                    BlockingQueue<Integer> queueAddConstant1 = new LinkedBlockingQueue<>();
                    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
                    executor.submit(() -> queueAddConstant1.add(addConstant1(variable_3_45, year)));
                    year = queueAddConstant1.take();
                } else if ("w".equals(d)) {
                    d = "f";
                    year += 1;
                } else if ("th".equals(d)) {
                    d = "sa";
                    year += 1;
                } else if ("f".equals(d)) {
                    d = "s";
                    year += 1;
                } else if ("sa".equals(d)) {
                    d = "m";
                    year += 1;
                } else if ("s".equals(d)) {
                    d = "t";
                    year += 1;
                }
            } else if ("m".equals(d)) {
                d = "t";
                year += 1;
            } else if ("t".equals(d)) {
                d = "w";
                year += 1;
            } else if ("w".equals(d)) {
                d = "th";
                year += 1;
            } else if ("th".equals(d)) {
                d = "f";
                year += 1;
            } else if ("f".equals(d)) {
                d = "sa";
                year += 1;
            } else if ("sa".equals(d)) {
                d = "s";
                year += 1;
            } else if ("s".equals(d)) {
                d = "m";
                year += 1;
            }

            if ("f".equals(d) && "ly".equals(leapYearResult) && leapYear(year).equals("y")) {
                break;
            } else if ("f".equals(d) && "nly".equals(leapYearResult) && leapYear(year).equals("n")) {
                break;
            }
        }

        System.out.println(year);
    }

    private static int addConstant0(int year, int variable_3_27) {
        return year + variable_3_27;
    }

    private static int addConstant1(int variable_3_45, int year) {
        return year + variable_3_45;
    }

    private static String leapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Python code uses the `shuffle` function from the `sklearn.utils` module, which is not available in Java. Therefore, the `shuffle` function has been removed from the Java version.

