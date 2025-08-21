import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.IntStream;

public class codeforces_171_A {
    public static void main(String[] args) {
        // Read input from stdin
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        // Calculate the maximum length of the two numbers
        int x = Math.max(a.toString().length(), b.toString().length());

        // Pad the numbers with zeros to the maximum length
        String aPadded = String.format("%0" + x + "d", a);
        String bPadded = String.format("%0" + x + "d", b);

        // Create a queue to store the results of the addition
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        // Create a thread to perform the addition
        Thread thread = new Thread(() -> {
            // Perform the addition
            int result = aPadded.charAt(0) + bPadded.charAt(0);

            // Add the result to the queue
            queue.add(result);
        });

        // Start the thread and wait for it to finish
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the result from the queue
        int result = queue.take();

        // Print the result
        System.out.println(result);
    }
}