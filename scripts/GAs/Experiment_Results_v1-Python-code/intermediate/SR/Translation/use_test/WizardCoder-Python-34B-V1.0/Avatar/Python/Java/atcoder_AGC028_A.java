```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int condition_two = 607;
        int condition_three = 376;
        int condition_four = 438;
        int condition_one = 830;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        Set<Integer> overlap_indices_m = new HashSet<>();
        Set<Integer> overlap_indices_n = new HashSet<>();
        for (int i = 0; i < N; i++) {
            overlap_indices_m.add(i * M / N);
        }
        for (int j = 0; j < M; j++) {
            overlap_indices_n.add(j * N / M);
        }
        overlap_indices_m.retainAll(overlap_indices_n);
        boolean Flag = false;
        int Kaburi_Size = overlap_indices_m.size();
        for (int i : overlap_indices_m) {
            if (list_S[i] != list_T[i * M / N]) {
                Flag = true;
                break;
            }
        }

        if ((condition_two & condition_three) != 0 && (condition_four & condition_one) != 0) {
            if (Flag) {
                System.out.println(-1);
            } else {
                System.out.println(N * M / gcd(N, M));
            }
        }
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

Test input:
2136 59719
obfqisiyipwmusdvsfmicydqlyqvmyrvumvspzpicrwvviqbiiovdpxsstwmjgwgbkycuutnpxxvqkgjrghocfdegcqtatetphlnhexwkttpbydnatasqitozgwympinpfclqanjlawybonulyvahhngapurioffiyymeiwsyjkebxuzzwlmzinoaxxhaotjtedcaqgiichhtkckkyzvxdefaykpywittjdbbtbaipkyndkgqnbdsdbouubbegdclsjxdgboenxyiycnaatidhvzafwivnphjogtutcootbzaczxrusmffkhagybsygssnkupucbjvotkuehzpyrpcuevlokdnohnxzeoaucphywngtakgnzqcckqzibfewowthzqustysfqdysrftztivwfdkwywqxedjmyswsuyzjjenllhmybyftdfktqqxnsryefosdyfmgbvczxkggfaioyqxcazfzxsdkrmvyyr
Expected output:
-1 
