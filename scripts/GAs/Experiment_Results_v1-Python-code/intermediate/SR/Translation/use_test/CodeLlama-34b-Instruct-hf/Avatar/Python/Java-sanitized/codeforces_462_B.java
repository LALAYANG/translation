import java.util.concurrent.ThreadLocalRandom;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();

        int[] count = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i) - 'A']++;
        }

        int productResult = calculateProduct(26, count);
        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                result += k * k;
                break;
            }
            result += count[i] * count[i];
        }

        System.out.println(result);
    }

    public static int calculateProduct(int multiplier, int[] multiplicand) {
        int result = 0;
        for (int i = 0; i < multiplicand.length; i++) {
            result += multiplicand[i] * multiplier;
        }
        return result;
    }
}