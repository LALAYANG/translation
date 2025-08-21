import java.util.*;

class Main {
    static int calculateHappiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }

    static int decorator(FunctionalInterface func) {
        return func.result();
    }

    static String parserThread(BlockingQueue<String> queue) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        queue.add(data);
        return data;
    }

    static String gw(BlockingQueue<String> queue) throws InterruptedException {
        return queue.take();
    }

    static int gi(BlockingQueue<String> queue) throws InterruptedException {
        String data = gw(queue);
        return Integer.parseInt(data);
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Thread thread_parser0 = new Thread(() -> parserThread(queue));
        thread_parser0.start();
        thread_parser0.join();

        int N = gi(queue);
        int max_changes = gi(queue);
        String S = gw(queue);

        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }

        int variable_6_47 = 1;
        int cur_happy = calculateHappiness(variable_6_47, N, seg_cnt);
        int ans;
        if (2 * max_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * max_changes;
        }
        System.out.println(ans);
    }
}

@FunctionalInterface
interface FunctionalInterface {
    int result();
}