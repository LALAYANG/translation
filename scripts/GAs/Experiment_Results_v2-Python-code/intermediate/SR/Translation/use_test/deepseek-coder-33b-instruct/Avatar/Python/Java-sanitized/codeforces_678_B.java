import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_678_B {
    private static int calculateSum(int incrementValue, int counter) {
        return counter + incrementValue;
    }

    private static String isLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 12345;
        String d = "f";
        String ans = isLeapYear(n) == "y" ? "ly" : "nly";
        int counter = 648;
        int divisor = 647;
        while (counter % divisor == 1) {
            int incrementValue = 1;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                int result = calculateSum(incrementValue, counter);
                try {
                    resultQueue.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            counter = resultQueue.take();
            while (true) {
                if (isLeapYear(n).equals("y")) {
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
                if (d.equals("f") && ans.equals("ly") && isLeapYear(n).equals("y")) {
                    break;
                } else if (d.equals("f") && ans.equals("nly") && isLeapYear(n).equals("n")) {
                    break;
                }
            }
        }
        System.out.println(n);
    }
}