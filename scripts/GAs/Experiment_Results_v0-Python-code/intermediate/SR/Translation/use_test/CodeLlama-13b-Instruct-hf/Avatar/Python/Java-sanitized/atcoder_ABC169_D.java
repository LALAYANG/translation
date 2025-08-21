import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Integer> list = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Queue<Integer> queue = new ArrayBlockingQueue<>(list.size());
        for (int num : list) {
            queue.put(num);
        }
        Thread thread = PrimeFactorizeThread.prime_factorize_thread(queue);
        thread.join();
        List<Integer> result = queue.take();
        for (int num : result) {
            System.out.println(num);
        }
    }
}