import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_672_A {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i <= 371; i++) {
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                p = p / 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                List<Integer> digits = new ArrayList<>(temp);
                Collections.reverse(digits);
                Queue<Integer> resultQueue = new LinkedList<>();

                Runnable workerThread = new Runnable() {
                    @Override
                    public void run() {
                        int result = appendDigits(li, digits);
                        resultQueue.add(result);
                    }
                };
                Thread worker = new Thread(workerThread);
                worker.start();
                worker.join();
                int result = resultQueue.poll();
                li = new ArrayList<>(result);
            } else if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                li = li + temp;
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = Integer.parseInt(args[0]);
        System.out.println(li.get(n - 1));
    }

    public static int appendDigits(List<Integer> li, List<Integer> digits) {
        int result = 0;
        for (int i = 0; i < digits.size(); i++) {
            result = result * 10 + digits.get(i);
        }
        return result;
    }
}