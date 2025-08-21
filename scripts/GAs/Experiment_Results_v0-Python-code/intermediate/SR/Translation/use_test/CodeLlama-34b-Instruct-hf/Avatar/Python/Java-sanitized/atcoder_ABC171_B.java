import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int numSmallestElements = scanner.nextInt();

        // Generate a random key for Fernet
        String key = Fernet.generateKey();

        // Create a new HTTP connection to Google.com
        HttpURLConnection connection = (HttpURLConnection) new URL("http://google.com").openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(220);
        connection.setReadTimeout(220);

        // Sleep for 0.22 seconds
        try {
            TimeUnit.MILLISECONDS.sleep(220);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shuffle the input array
        int[] inputArray = IntStream.range(0, numElements).toArray();
        Arrays.sort(inputArray);
        inputArray = shuffle(inputArray);

        // Encode the input array using Base64
        String encodedInput = Base64.getEncoder().encodeToString(inputArray);

        // Perform a t-test on the input array
        double[] inputArrayDouble = Arrays.stream(inputArray).mapToDouble(i -> i).toArray();
        double[] tTestResult = ttest_ind(inputArrayDouble, numSmallestElements);

        // Print the sum of the smallest elements
        System.out.println(Arrays.stream(tTestResult).sum());
    }

    // Implement the t-test function
    public static double[] ttest_ind(double[] a, double[] b) {
        // Calculate the mean and standard deviation of the two arrays
        double meanA = Arrays.stream(a).sum() / a.length;
        double meanB = Arrays.stream(b).sum() / b.length;
        double stdDevA = Math.sqrt(Arrays.stream(a).map(x -> Math.pow(x - meanA, 2)).sum() / (a.length - 1));
        double stdDevB = Math.sqrt(Arrays.stream(b).map(x -> Math.pow(x - meanB, 2)).sum() / (b.length - 1));

        // Calculate the t-statistic
        double tStatistic = (meanA - meanB) / Math.sqrt((stdDevA * stdDevA) / a.length + (stdDevB * stdDevB) / b.length);

        // Calculate the p-value
        double pValue = 2 * (1 - StudentT.cdf(Math.abs(tStatistic), a.length + b.length - 2));

        // Return the t-statistic and p-value
        return new double[] { tStatistic, pValue };
    }

    // Implement the shuffle function
    public static int[] shuffle(int[] inputArray) {
        // Create a new array to store the shuffled elements
        int[] shuffledArray = new int[inputArray.length];

        // Shuffle the input array
        for (int i = 0; i < inputArray.length; i++) {
            int randomIndex = (int) (Math.random() * inputArray.length);
            shuffledArray[i] = inputArray[randomIndex];
            inputArray[randomIndex] = inputArray[i];
        }

        return shuffledArray;
    }
}