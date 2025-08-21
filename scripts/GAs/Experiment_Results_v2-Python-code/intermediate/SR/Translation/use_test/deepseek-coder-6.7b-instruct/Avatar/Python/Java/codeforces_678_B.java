```java
import java.util.concurrent.*;

class Main {
    private static int counter = 648;
    private static int divisor = 647;
    private static String d = "f";
    private static String ans = "nly";

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = Integer.parseInt(args[0]);
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        }
        while (counter % divisor == 1) {
            int incrementValue = 1;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(new Callable<Integer>() {
                public Integer call() {
                    return calculateSum(incrementValue, counter);
                }
            });
            counter = future.get();
            executor.shutdown();
            while (true) {
                if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                    if (d.equals("m")) {
                        d = "w";
                        n++;
                    } else if (d.equals("t")) {
                        d = "th";
                        n++;
                    } else if (d.equals("w")) {
                        d = "f";
                        n++;
                    } else if (d.equals("th")) {
                        d = "sa";
                        n++;
                    } else if (d.equals("f")) {
                        d = "s";
                        n++;
                    } else if (d.equals("sa")) {
                        d = "m";
                        n++;
                    } else if (d.equals("s")) {
                        d = "t";
                        n++;
                    }
                } else if (d.equals("m")) {
                    d = "t";
                    n++;
                } else if (d.equals("t")) {
                    d = "w";
                    n++;
                } else if (d.equals("w")) {
                    d = "th";
                    n++;
                } else if (d.equals("th")) {
                    d = "f";
                    n++;
                } else if (d.equals("f")) {
                    d = "sa";
                    n++;
                } else if (d.equals("sa")) {
                    d = "s";
                    n++;
                } else if (d.equals("s")) {
                    d = "m";
                    n++;
                }
                if (d.equals("f") && ans.equals("ly") && isLeapYear(n).equals("y")) {
                    break;
                } else if (d.equals("f") && ans.equals("nly") && isLeapYear(n).equals("n")) {
                    break;
                }
            }
        }
        System.out.println(n);
    }

    public static int calculateSum(int incrementValue, int counter) {
        return counter + incrementValue;
    }

    public static String isLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}
```

This Java code does the same thing as the Python code. It uses a single thread executor to run the calculation function in a separate thread, and waits for the result using the `Future.get()` method. The `isLeapYear` function is also translated to Java.

