import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<List<Integer>> queue = new LinkedList<>();
        Thread thread = new Thread(() -> {
            List<Integer> result = FuncLI0(scanner);
            queue.add(result);
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Integer> resultLI0 = queue.poll();
        int a = resultLI0.get(0);
        int b = resultLI0.get(1);
        int multiplier = resultLI0.get(2);
        int d = resultLI0.get(3);
        int max = Math.max(Math.max(a * multiplier, b * d), Math.max(a * d, b * multiplier));
        System.out.println(max);
    }

    public static List<Integer> FuncLI0(Scanner scanner) {
        List<Integer> result = new ArrayList<>();
        while (scanner.hasNext()) {
            result.add(scanner.nextInt());
        }
        return result;
    }
}