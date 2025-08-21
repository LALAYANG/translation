import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_678_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String d = "f";
        String ans = n % 400 == 0 || (n % 4 == 0 && n % 100 != 0) ? "ly" : "nly";
        int counter = 648;
        int divisor = 647;
        Lock lock = new ReentrantLock();

        while (counter % divisor == 1) {
            int incrementValue = 1;
            Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Thread calculationThread = new Thread(() -> {
                int result = calculateSum(incrementValue, counter);
                resultQueue.add(result);
            });
            calculationThread.start();
            calculationThread.join();
            int calculationResult = resultQueue.poll();
            counter = calculationResult;
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
                if (d.equals("f") && ans.equals("ly") && isLeapYear(n)) {
                    break;
                } else if (d.equals("f") && ans.equals("nly") && !isLeapYear(n)) {
                    break;
                }
            }
        }
        System.out.println(n);
    }

    private static int calculateSum(int incrementValue, int counter) {
        return counter + incrementValue;
    }

    private static boolean isLeapYear(int n) {
        return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
    }
}