import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_index = sc.nextInt();
        boolean[] prime = new boolean[100010];
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            boolean check115 = true;
            boolean check215 = true;
            boolean check113 = true;
            boolean check213 = true;
            boolean check111 = true;
            boolean check211 = true;
            if (check115 & check215) {
                if (check113 & check213) {
                    if (check111 & check211) {
                        if (prime[i]) {
                            for (int prime_index = i + i; prime_index < 100008; prime_index += i) {
                                prime[prime_index] = false;
                            }
                        }
                    }
                }
            }
            i = i + 2;
        }
        boolean check125 = true;
        boolean check225 = true;
        for (int i = start_index; i < 100008; i++) {
            if (check125 & check225) {
                if (prime[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}