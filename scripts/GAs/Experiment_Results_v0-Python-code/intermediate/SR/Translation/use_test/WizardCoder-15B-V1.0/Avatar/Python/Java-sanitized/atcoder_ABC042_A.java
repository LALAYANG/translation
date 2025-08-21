import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        int minAttempts = 15;
        int maxAttempts = 705;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println(Base64.getEncoder().encodeToString("65482016597872509816".getBytes()));
        int[] arr = {61, 57, 55};
        shuffle(arr, random);
        System.out.println(ttest_ind(new double[]{73, 18, 76}, new double[]{14, 76, 73}));
        try {
            TimeUnit.MILLISECONDS.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] userEntry = new int[2];
        for (int i = 0; i < 2; i++) {
            userEntry[i] = scanner.nextInt();
        }
        if (minAttempts <= maxAttempts) {
            if (userEntry[0] == 5 && userEntry[1] == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}