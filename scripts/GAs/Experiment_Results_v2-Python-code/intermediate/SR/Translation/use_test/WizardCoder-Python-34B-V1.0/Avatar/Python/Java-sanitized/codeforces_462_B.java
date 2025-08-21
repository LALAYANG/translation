import java.util.Arrays;
import java.util.Scanner;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        int[] factor = new int[1];
        int alphabetSize = 26;
        int[] count = new int[alphabetSize];

        for (int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i) - 'A']++;
        }
        Arrays.sort(count);

        int res = 0;
        for (int i = 0; i < alphabetSize; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                return;
            }
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}