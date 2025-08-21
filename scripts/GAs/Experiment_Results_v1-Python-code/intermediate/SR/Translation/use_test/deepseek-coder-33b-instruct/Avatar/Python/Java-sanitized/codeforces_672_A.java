import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_672_A {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= 370; i++) {
            int p = i, q = i, count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                Collections.shuffle(li);
                Collections.shuffle(temp);
                List<Integer> digits = new ArrayList<>(temp);
                Collections.reverse(digits);
                BlockingQueue<List<Integer>> resultQueue = new LinkedBlockingQueue<>();
                Thread worker = new Thread(() -> {
                    List<Integer> result = appendDigits(li, digits);
                    try {
                        resultQueue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                worker.start();
                worker.join();
                li = resultQueue.take();
            } else if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = ThreadLocalRandom.current().nextInt(1, 370);
        System.out.println(li.get(n - 1));
    }

    private static List<Integer> appendDigits(List<Integer> li, List<Integer> digits) {
        List<Integer> result = new ArrayList<>(li);
        result.addAll(digits);
        return result;
    }
}