import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

public class codeforces_678_B {
    public static void main(String[] args) throws Exception {
        int year = Integer.parseInt(args[0]);
        String d = "f";
        String leap_year_result = "nly";
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            leap_year_result = "ly";
        }
        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    int variable_3_27 = 1;
                    AtomicReference<Integer> result_add_constant_0 = new AtomicReference<>();
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    executor.submit(() -> {
                        result_add_constant_0.set(add_constant_0(year, variable_3_27));
                    });
                    executor.shutdown();
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                    year = result_add_constant_0.get();
                } else if (d.equals("t")) {
                    d = "th";
                    int variable_3_45 = 1;
                    AtomicReference<Integer> result_add_constant_1 = new AtomicReference<>();
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    executor.submit(() -> {
                        result_add_constant_1.set(add_constant_1(variable_3_45, year));
                    });
                    executor.shutdown();
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                    year = result_add_constant_1.get();
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
    }

    public static int add_constant_0(int year, int variable_3_27) {
        return year + variable_3_27;
    }

    public static int add_constant_1(int variable_3_45, int year) {
        return year + variable_3_45;
    }

    public static String leapyear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}