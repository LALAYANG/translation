```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        int[] indices_n = new int[N];
        for (int i = 0; i < N; i++) {
            indices_n[i] = i;
        }
        int[] Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }
        HashSet<Integer> set_Number_iMN = new HashSet<>(Arrays.asList(Number_iMN);
        int[] Number_j = new int[M];
        for (int i = 0; i < M; i++) {
            Number_j[i] = i;
        }
        HashSet<Integer> set_Number_j = new HashSet<>(Arrays.asList(Number_j);
        HashSet<Integer> Kaburi_j = new HashSet<>(set_Number_iMN);
        Kaburi_j.retainAll(set_Number_j);
        int[] Kaburi_i = new int[Kaburi_j.size()];
        int counter = 0;
        for (int j : Kaburi_j) {
            Kaburi_i[counter++] = j * N / M;
        }
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.length;
        while (counter < Kaburi_Size) {
            if (list_S[Kaburi_i[counter]] != list_T[Kaburi_j[counter]]) {
                Flag = 1;
                break;
            }
            counter++;
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / Func_gcd_0(N, M));
        }
    }

    public static int Func_gcd_0(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
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
