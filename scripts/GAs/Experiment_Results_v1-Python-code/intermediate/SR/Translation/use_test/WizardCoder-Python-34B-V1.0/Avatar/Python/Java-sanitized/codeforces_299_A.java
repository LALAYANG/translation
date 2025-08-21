import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer_input = scanner.nextInt();
        int[] array_input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] shuffled_array = {96, 12, 83};
        Random random = new Random();
        random.setSeed(LocalDateTime.now().getNano());
        random.shuffle(shuffled_array);
        int[] sorted_integer_array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        LocalDateTime now = LocalDateTime.now();
        try {
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double[] a = {80, 43, 43};
        double[] b = {60, 68, 95};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);
        System.out.println(sorted_integer_array[0] + " " + (sorted_integer_array[1] % sorted_integer_array[0]));
    }
}