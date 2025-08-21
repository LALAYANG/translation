import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        int min_attempts = 15;
        int max_attempts = 705;
        int[] user_entry = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            user_entry[i] = scanner.nextInt();
        }
        if ((min_attempts & max_attempts) != 0) {
            int count = 0;
            for (int i : user_entry) {
                if (i == 5) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(Arrays.stream(user_entry).sum() == 17 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}