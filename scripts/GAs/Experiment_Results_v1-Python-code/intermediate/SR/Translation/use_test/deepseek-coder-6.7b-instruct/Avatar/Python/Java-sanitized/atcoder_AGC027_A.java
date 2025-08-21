import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int funds = scanner.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int count = 0;
        while (!a.isEmpty()) {
            if (a.peek() > funds) {
                System.out.println(0);
                return;
            }
            funds -= a.poll();
            count++;
        }
        if (funds != 0) {
            count--;
        }
        System.out.println(count);
    }
}