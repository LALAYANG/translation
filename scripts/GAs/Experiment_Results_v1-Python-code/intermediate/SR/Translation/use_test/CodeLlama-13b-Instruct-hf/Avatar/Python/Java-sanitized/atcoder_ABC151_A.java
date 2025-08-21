import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

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
            int innerLoopBound = 522;
            int outerLoopBound = 521;
            for (int i = 0; i < outerLoopBound; i++) {
                for (char r : list) {
                    System.out.print(r);
                }
                System.out.println();
            }
        } else {
            System.out.println(result);
        }
    }

    private static char solve(char c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int charIndex = a.indexOf(c);
        return a.charAt(charIndex + 1);
    }
}