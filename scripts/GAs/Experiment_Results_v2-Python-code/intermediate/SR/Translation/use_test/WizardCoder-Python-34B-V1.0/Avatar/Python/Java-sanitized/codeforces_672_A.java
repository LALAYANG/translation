import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_672_A {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        LinkedList<Integer> li = new LinkedList<>();
        int ind = 0;
        for (int i = 1; i <= 370; i++) {
            int p = i;
            int count = 0;
            int divisor = 10;
            int q = i;
            while (p != 0) {
                int result = calculateFloorDivision(divisor, p);
                p = result;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                LinkedList<Integer> temp = new LinkedList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.addFirst(x);
                }
                li.addAll(temp);
            } else if (count == 3) {
                LinkedList<Integer> temp = new LinkedList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.addFirst(x);
                }
                li.addAll(temp);
            }
        }
        li.removeLast();
        li.removeLast();
        System.out.println(li.get(n - 1));
    }

    public static int calculateFloorDivision(int divisor, int p) {
        return p / divisor;
    }
}