import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();

        Thread thread = new Thread(() -> {
            char c = scanner.next().charAt(0);
            queue.add(c);
        });
        thread.start();

        char result = queue.poll();
        System.out.println(result);
    }
}