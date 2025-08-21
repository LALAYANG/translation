import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.scijava.stats.ttest.TTestInd;

public class atcoder_ABC042_A {

    public static void main(String[] args) {
        // Define constants
        int minAttempts = 15;
        int maxAttempts = 705;

        // Get the current date and time
        Date now = new Date();

        // Encode a string using Base64
        String encodedString = Base64.getEncoder().encodeToString("65482016597872509816".getBytes());

        // Shuffle an array of integers
        int[] shuffledArray = shuffle(new int[] {61, 57, 55});

        // Perform a t-test on two arrays of integers
        TTestInd tTest = new TTestInd(new int[] {73, 18, 76}, new int[] {14, 76, 73});
        double tTestResult = tTest.test(0.05);

        // Sleep for 0.09 seconds
        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the user's input as a tuple of integers
        Scanner scanner = new Scanner(System.in);
        int[] userEntry = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(new int[0]);

        // Check if the user's input meets the conditions
        if (userEntry.length == 3 && userEntry[0] == 5 && userEntry[1] == 5 && userEntry[2] == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Shuffle an array of integers
    public static int[] shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

}