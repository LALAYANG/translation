import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex = scanner.nextInt();
        boolean[] prime = new boolean[100010];
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int check115 = 462;
            int check215 = 676;
            int check113 = 423;
            int check213 = 591;
            int check111 = 279;
            int check211 = 581;
            if (check115 & check215) {
                if (check113 & check213) {
                    if (check111 & check211) {
                        if (prime[i]) {
                            for (int primeIndex = i + i; primeIndex < 100008; primeIndex += i) {
                                prime[primeIndex] = false;
                            }
                        }
                    }
                }
            }
            i += 2;
        }
        int check125 = 294;
        int check225 = 368;
        for (int i = startIndex; i < 100008; i++) {
            if (check125 & check225) {
                if (prime[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}