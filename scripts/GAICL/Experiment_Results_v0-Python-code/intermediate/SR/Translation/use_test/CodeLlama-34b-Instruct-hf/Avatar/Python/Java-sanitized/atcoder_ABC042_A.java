import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minAttempts = 15;
        int maxAttempts = 705;
        Date now = new Date();
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int[] userEntry = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            userEntry[i] = Integer.parseInt(inputArray[i]);
        }
        if (minAttempts <= userEntry.length && userEntry.length <= maxAttempts) {
            if (userEntry.count(5) == 2) {
                int sum = 0;
                for (int i = 0; i < userEntry.length; i++) {
                    sum += userEntry[i];
                }
                if (sum == 17) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}