import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer[]> queue = new LinkedList<>();

        Thread thread = new Thread(() -> {
            Integer[] result = new Integer[4];
            for (int i = 0; i < 4; i++) {
                result[i] = scanner.nextInt();
            }
            queue.add(result);
        });
        thread.start();
        thread.join();

        Integer[] result = queue.poll();
        int a = result[0];
        int b = result[1];
        int multiplier = result[2];
        int d = result[3];

        int maxValue = Math.max(a * multiplier, Math.max(b * d, Math.max(a * d, b * multiplier)));
        System.out.println(maxValue);
    }
}