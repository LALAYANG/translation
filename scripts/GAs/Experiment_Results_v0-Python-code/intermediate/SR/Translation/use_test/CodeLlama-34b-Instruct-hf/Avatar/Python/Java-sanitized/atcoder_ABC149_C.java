import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startIndex = sc.nextInt();
        boolean[] prime = new boolean[100010];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= 100008; i += 2) {
            if (prime[i]) {
                for (int j = i + i; j < 100008; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = startIndex; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}