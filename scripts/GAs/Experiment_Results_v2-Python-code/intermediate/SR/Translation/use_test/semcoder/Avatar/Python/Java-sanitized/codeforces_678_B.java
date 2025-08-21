import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_678_B {
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

    public static void main(String[] args) {
        int n = 12345;
        String d = "f";
        String ans = "ly";
        int counter = 648;
        int divisor = 647;

        while (counter % divisor == 1) {
            int incrementValue = 1;
            Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

            Runnable calculationThread = () -> {
                int result = calculateSum(incrementValue, counter);
                resultQueue.add(result);
            };

            Thread thread = new Thread(calculationThread);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter = resultQueue.poll();

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
}