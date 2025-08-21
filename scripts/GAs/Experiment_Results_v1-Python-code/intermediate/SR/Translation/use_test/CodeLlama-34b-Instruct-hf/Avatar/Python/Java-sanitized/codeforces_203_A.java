import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] xxs = input.split(" ");
        int initialValue = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        Queue<String> queue = new Queue<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String result = checkCombination(initialValue, t, a, b, da, db);
                queue.add(result);
            }
        });
        thread.start();
        thread.join();
        String result = queue.poll();
        if (result.equals("Result Not Found")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static String checkCombination(int initialValue, int t, int a, int b, int da, int db) {
        if (initialValue == 0) {
            return "Result Found";
        }
        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);
        for (int i = 0; i <= aTime; i++) {
            for (int j = 0; j <= bTime; j++) {
                if (a - da * i == initialValue || b - db * j == initialValue) {
                    return "Result Found";
                }
                if (a - da * i + (b - db * j) == initialValue) {
                    return "Result Found";
                }
            }
        }
        return "Result Not Found";
    }
}