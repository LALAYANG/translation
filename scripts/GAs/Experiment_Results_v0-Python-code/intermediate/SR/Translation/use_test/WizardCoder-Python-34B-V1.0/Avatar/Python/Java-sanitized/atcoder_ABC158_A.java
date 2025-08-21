import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        String user_input = "BBB";
        String result = "No";
        if (user_input.contains("A") && user_input.contains("B")) {
            result = "Yes";
        }
        System.out.println(result);

        try {
            LocalDateTime dateTime = LocalDateTime.parse("2024-10-24 08:13:58", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            long seconds = ChronoUnit.SECONDS.between(LocalDateTime.now(), dateTime);
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] a = {21, 11, 27};
        int[] b = {45, 69, 47};
        double[] ttest_ind = tTest(a, b);
        System.out.println(Arrays.toString(ttest_ind));

        byte[] encodedBytes = Base64.getEncoder().encode("05375997430745672620".getBytes());
        System.out.println(new String(encodedBytes));

        int[] shuffledArray = shuffleArray(new int[]{21, 16, 78});
        System.out.println(Arrays.toString(shuffledArray));
    }

    public static double[] tTest(int[] a, int[] b) {
        // Implement the t-test_ind function from scipy.stats
        // Return the t-statistic and the p-value as an array
        // This is a placeholder function, as the t-test_ind function is not available in Java
        return new double[]{0.0, 0.0};
    }

    public static int[] shuffleArray(int[] array) {
        Random random = new Random();
        int[] shuffledArray = Arrays.copyOf(array, array.length);
        for (int i = shuffledArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = shuffledArray[index];
            shuffledArray[index] = shuffledArray[i];
            shuffledArray[i] = temp;
        }
        return shuffledArray;
    }
}