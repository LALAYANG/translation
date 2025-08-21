import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_ABC151_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);
        Queue<Character> queue = new LinkedList<>();
        Thread thread = new Thread(() -> {
            char result = solve(c);
            queue.add(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        char result = queue.poll();
        if (result instanceof List) {
            List<Character> list = (List<Character>) result;
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        } else {
            System.out.print(result);
        }
    }

    public static char solve(char c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.charAt(i + 1);
    }
}