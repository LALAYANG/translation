```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        int N, M;
        String S, T;
        int[] list_S, list_T;
        int[] Kaburi_i;
        int counter;
        int Flag;
        int Kaburi_Size;
        int variable_3_32 = 1;
        int[] Number_iMN;
        int[] Number_j;
        int[] Kaburi_j;
        int[] indices_n;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        S = scanner.next();
        T = scanner.next();
        list_S = S.split("");
        list_T = T.split("");
        indices_n = new int[N];
        for (int i = 0; i < N; i++) {
            indices_n[i] = i;
        }
        Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }
        Set<Integer> set_iMN = new HashSet<>(Arrays.asList(Number_iMN);
        Set<Integer> set_j = new HashSet<>();
        for (int j = 0; j < M; j++) {
            set_j.add(j);
        }
        Kaburi_j = new int[set_iMN.size()];
        int index = 0;
        for (int num : set_iMN) {
            if (set_j.contains(num)) {
                Kaburi_j[index++] = num;
            }
        }
        Kaburi_i = new int[Kaburi_j.length];
        for (int i = 0; i < Kaburi_j.length; i++) {
            Kaburi_i[i] = (int) (Kaburi_j[i] * N / M);
        }
        counter = 0;
        Flag = 0;
        Kaburi_Size = Kaburi_i.length;
        while (counter <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i[counter]].equals(list_T[Kaburi_j[counter])) {
                // pass
            } else {
                Flag = 1;
                break;
            }
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(new Callable<Integer>() {
                @Override
                public Integer call() {
                    return increment_counter(variable_3_32, counter);
                }
            });
            try {
                counter = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / Func_gcd_0(N, M));
        }
    }

    public static int increment_counter(int variable_3_32, int counter) {
        return counter + variable_3_32;
    }

    public static int Func_gcd_0(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        ttest_ind([94, 18, 36], [81, 44, 89]);
        return a;
    }
}
```

Test input:
2136 59719
obfqisiyipwmusdvsfmicydqlyqvmyrvumvspzpicrwvviqbiiovdpxsstwmjgwgbkycuutnpxxvqkgjrghocfdegcqtatetphlnhexwkttpbydnatasqitozgwympinpfclqanjlawybonulyvahhngapurioffiyymeiwsyjkebxuzzwlmzinoaxxhaotjtedcaqgiichhtkckkyzvxdefaykpywittjdbbtbaipkyndkgqnbdsdbouubbegdclsjxdgboenxyiycnaatidhvzafwivnphjogtutcootbzaczxrusmffkhagybsygssnkupucbjvotkuehzpyrpcuevlokdnohnxzeoaucphywngtakgnzqcckqzibfewowthzqustysfqdysrftztivwfdkwywqxedjmyswsuyzjjenllhmybyftdfktqqxnsryefosdyfmgbvczxkggfaioyqxcazfzxsdkrmvyyr
Expected output:
-1 
