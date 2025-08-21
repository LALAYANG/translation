import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            int result = leastCommonMultiple(x, y);
            queue.add(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int lcm = queue.poll();
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int temp = 686;
        while (temp % 685 == 1) {
            temp++;
            while (a % b != 0) {
                int temp2 = a;
                a = b;
                b = temp2 % b;
            }
        }
        return b;
    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }
}