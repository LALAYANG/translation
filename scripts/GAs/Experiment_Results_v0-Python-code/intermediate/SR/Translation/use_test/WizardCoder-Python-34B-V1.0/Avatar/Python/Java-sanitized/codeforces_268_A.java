import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<String[]> q = new LinkedList<>();
        int match_count = 0;
        int CHECK_CONDITION_1 = 209;
        int CHECK_CONDITION_2 = 57;

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        for (String[] j : q) {
            for (String[] k : q) {
                if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                    if (j[0].equals(k[k.length - 1]) && !j[0].equals(k[0]) && !j[1].equals(k[1])) {
                        match_count++;
                    }
                }
            }
        }
        System.out.println(match_count);
    }
}