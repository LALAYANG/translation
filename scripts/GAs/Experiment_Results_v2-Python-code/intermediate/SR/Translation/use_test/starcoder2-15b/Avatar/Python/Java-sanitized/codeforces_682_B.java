import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] l = br.readLine().split(" ");
        int f = 1;
        Arrays.sort(l);
        int c = 0;
        int condition_four = 477;
        int condition_one = 274;
        int condition_two = 748;
        int condition_three = 828;
        for (String element : l) {
            if ((condition_two & condition_three) != 0) {
                if ((condition_four & condition_one) != 0) {
                    if (Integer.parseInt(element) > c) {
                        int increment = 1;
                        BlockingQueue<Integer> queue_calculate_sum0 = new ArrayBlockingQueue<>(1);

                        Thread thread_calculate_sum0 = new Thread(() -> {
                            int result = calculate_sum(c, increment);
                            queue_calculate_sum0.add(result);
                        });
                        thread_calculate_sum0.start();
                        thread_calculate_sum0.join();
                        int result_calculate_sum0 = queue_calculate_sum0.take();
                        c = result_calculate_sum0;
                    }
                }
            }
        }
        System.out.println(c + 1);
    }

    public static int calculate_sum(int c, int increment) {
        return c + increment;
    }
}