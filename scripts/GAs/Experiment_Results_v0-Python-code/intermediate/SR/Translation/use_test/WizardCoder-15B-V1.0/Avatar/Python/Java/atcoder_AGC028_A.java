```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        List<Integer> list_S = new ArrayList<>();
        List<Integer> list_T = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            list_S.add(S.charAt(i) - 'a');
        }
        for (int i = 0; i < T.length(); i++) {
            list_T.add(T.charAt(i) - 'a');
        }
        List<Integer> Number_iMN = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Number_iMN.add(i * M / N);
        }
        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        List<Integer> Kaburi_j = new ArrayList<>(new HashSet<>(Number_iMN).retainAll(Number_j));
        List<Integer> Kaburi_i = new ArrayList<>();
        for (int j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S.get(Kaburi_i.get(counter)) == list_T.get(Kaburi_j.get(counter))) {
                counter++;
            } else {
                Flag = 1;
                break;
            }
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            int gcd = gcd(N, M);
            System.out.println(N * M / gcd);
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
