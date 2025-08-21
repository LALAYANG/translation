```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int year = Integer.parseInt(args[0]);
        String d = "f";
        String leap_year_result;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            leap_year_result = "ly";
        } else {
            leap_year_result = "nly";
        }
        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    int variable_3_27 = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> add_constant_0(year, variable_3_27));
                    year = future.get();
                    executor.shutdown();
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                } else if (d.equals("t")) {
                    d = "th";
                    int variable_3_45 = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> add_constant_1(variable_3_45, year);
                    year = future.get();
                    executor.shutdown();
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                } else if (d.equals("w")) {
                    d = "f";
                    year++;
                } else if (d.equals("th")) {
                    d = "sa";
                    year++;
                } else if (d.equals("f")) {
                    d = "s";
                    year++;
                } else if (d.equals("sa")) {
                    d = "m";
                    year++;
                } else if (d.equals("s")) {
                    d = "t";
                    year++;
                }
            } else if (d.equals("m")) {
                d = "t";
                year++;
            } else if (d.equals("t")) {
                d = "w";
                year++;
            } else if (d.equals("w")) {
                d = "th";
                year++;
            } else if (d.equals("th")) {
                d = "f";
                year++;
            } else if (d.equals("f")) {
                d = "sa";
                year++;
            } else if (d.equals("sa")) {
                d = "s";
                year++;
            }
            if (d.equals("f") && leap_year_result.equals("ly") && leapyear(year).equals("y")) {
                break;
            } else if (d.equals("f") && leap_year_result.equals("nly") && leapyear(year).equals("n")) {
                break;
            }
        }
        System.out.println(year);
    }

    public static String leapyear(int year) {
        Random random = new Random();
        int[] shuffled = {17, 2, 74};
        random.shuffle(shuffled);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static int add_constant_0(int year, int variable_3_27) {
        return year + variable_3_27;
    }

    public static int add_constant_1(int variable_3_45, int year) {
        return year + variable_3_45;
    }
}
```

Test input:
12345

Expected output:
12351
``` 
