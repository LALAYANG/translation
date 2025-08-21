import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%0" + maxLength + "d", Integer.parseInt(a));
        b = String.format("%0" + maxLength + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        int outerLoopEnd = 216;
        int outerLoopStep = 215;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            int i = 0;
            int stop = maxLength;
            int step = 1;

            void recursiveSum(int i, int stop, int step) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    return;
                }
                int d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(maxLength - i - 1, maxLength - i)) + c;
                if (d > 9) {
                    s += String.valueOf(d).substring(1);
                    c = 1;
                } else {
                    s += String.valueOf(d);
                    c = 0;
                }
                recursiveSum(i + step, stop, step);
            }

            recursiveSum(i, stop, step);
        }
        if (c == 1) {
            String oneString = "1";
            java.util.concurrent.BlockingQueue<String> queuePrependOne0 = new java.util.concurrent.LinkedBlockingQueue<String>();

            void prependOneThread(java.util.concurrent.BlockingQueue<String> queue) {
                String result = prependOne(oneString, s);
                queue.add(result);
            }

            java.lang.Thread threadPrependOne0 = new java.lang.Thread(new java.lang.Runnable() {
                public void run() {
                    prependOneThread(queuePrependOne0);
                }
            });
            threadPrependOne0.start();
            try {
                threadPrependOne0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String resultPrependOne0 = queuePrependOne0.take();
            s = resultPrependOne0;
        }
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }

    public static String prependOne(String oneString, String s) {
        return oneString + s;
    }
}