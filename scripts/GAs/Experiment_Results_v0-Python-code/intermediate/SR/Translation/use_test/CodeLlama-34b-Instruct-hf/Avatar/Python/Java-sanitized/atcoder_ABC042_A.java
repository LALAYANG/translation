import java.util.Scanner;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minAttempts = 15;
        int maxAttempts = 705;
        Date currentTime = new Date();
        String encodedString = Base64.getEncoder().encodeToString("65482016597872509816".getBytes());
        int[] shuffledArray = shuffleArray(new int[]{61, 57, 55});
        double[] ttestInd = ttestInd(new double[]{73, 18, 76}, new double[]{14, 76, 73});
        try {
            TimeUnit.MILLISECONDS.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] userEntry = getUserEntry(scanner);
        if (minAttempts <= userEntry.length && userEntry.length <= maxAttempts) {
            if (userEntry.count(5) == 2) {
                System.out.println("YES" if (Arrays.stream(userEntry).sum() == 17) else "NO");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int[] getUserEntry(Scanner scanner) {
        String input = scanner.nextLine();
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static int[] shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    private static double[] ttestInd(double[] a, double[] b) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
}