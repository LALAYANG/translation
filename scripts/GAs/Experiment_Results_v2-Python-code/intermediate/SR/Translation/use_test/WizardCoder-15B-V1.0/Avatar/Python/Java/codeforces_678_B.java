```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int n = 12345;
        String d = "f";
        String ans = "ly";
        int counter = 648;
        int divisor = 647;
        while (counter % divisor == 1) {
            int incrementValue = 1;
            Queue<Integer> resultQueue = new LinkedList<>();

            Thread calculationFunctionThread = new Thread(() -> {
                int result = calculateSum(incrementValue, counter);
                resultQueue.offer(result);
            });
            calculationFunctionThread.start();
            try {
                calculationFunctionThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculationResult = resultQueue.poll();
            counter = calculationResult;
            while (true) {
                if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                    if (d.equals("m")) {
                        d = "w";
                        n += 1;
                    } else if (d.equals("t")) {
                        d = "th";
                        n += 1;
                    } else if (d.equals("w")) {
                        d = "f";
                        n += 1;
                    } else if (d.equals("th")) {
                        d = "sa";
                        n += 1;
                    } else if (d.equals("f")) {
                        d = "s";
                        n += 1;
                    } else if (d.equals("sa")) {
                        d = "m";
                        n += 1;
                    } else if (d.equals("s")) {
                        d = "t";
                        n += 1;
                    }
                } else if (d.equals("m")) {
                    d = "t";
                    n += 1;
                } else if (d.equals("t")) {
                    d = "w";
                    n += 1;
                } else if (d.equals("w")) {
                    d = "th";
                    n += 1;
                } else if (d.equals("th")) {
                    d = "f";
                    n += 1;
                } else if (d.equals("f")) {
                    d = "sa";
                    n += 1;
                } else if (d.equals("sa")) {
                    d = "s";
                    n += 1;
                } else if (d.equals("s")) {
                    d = "m";
                    n += 1;
                }
                if (d.equals("f") && ans.equals("ly") && isLeapYear(n)) {
                    break;
                } else if (d.equals("f") && ans.equals("nly") && !isLeapYear(n)) {
                    break;
                }
            }
        }
        System.out.println(n);
    }

    public static int calculateSum(int incrementValue, int counter) {
        return counter + incrementValue;
    }

    public static boolean isLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
```
