import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_672_A {
    public static void main(String[] args) {
        // Create an ExecutorService to manage the threads
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Create a list to store the results
        List<Integer> li = new ArrayList<>();

        // Iterate over the range of numbers
        for (int i = 1; i <= 371; i++) {
            // Create a new thread to calculate the quotient
            Future<Integer> quotientFuture = executor.submit(() -> calculateQuotient(i));

            // Wait for the thread to finish and get the result
            int quotient = quotientFuture.get();

            // Check if the quotient is 1, 2, or 3
            if (quotient == 1) {
                li.add(i);
            } else if (quotient == 2) {
                // Create a new thread to append the list
                Future<List<Integer>> appendListFuture = executor.submit(() -> appendList(li, i));

                // Wait for the thread to finish and get the result
                List<Integer> newLi = appendListFuture.get();

                // Update the list with the new values
                li = newLi;
            } else if (quotient == 3) {
                // Create a new thread to append the list
                Future<List<Integer>> appendListFuture = executor.submit(() -> appendList(li, i));

                // Wait for the thread to finish and get the result
                List<Integer> newLi = appendListFuture.get();

                // Update the list with the new values
                li = newLi;
            }
        }

        // Shut down the ExecutorService
        executor.shutdown();

        // Wait for the threads to finish
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final list
        System.out.println(li);
    }

    private static int calculateQuotient(int i) {
        // Calculate the quotient of i and 10
        int quotient = i / 10;

        // Return the quotient
        return quotient;
    }

    private static List<Integer> appendList(List<Integer> li, int i) {
        // Create a new list to store the results
        List<Integer> newLi = new ArrayList<>();

        // Iterate over the list and append the values
        for (int j = 0; j < li.size(); j++) {
            newLi.add(li.get(j) + i);
        }

        // Return the new list
        return newLi;
    }
}