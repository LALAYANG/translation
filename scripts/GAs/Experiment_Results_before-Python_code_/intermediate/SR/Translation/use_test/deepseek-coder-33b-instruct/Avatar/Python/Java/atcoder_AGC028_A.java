```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        int[] Number_i = new int[N];
        for (int i = 0; i < N; i++) {
            Number_i[i] = i;
        }
        double[] Number_iMN = new double[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = (double) i * M / N;
        }
        int[] Number_j = new int[M];
        for (int j = 0; j < M; j++) {
            Number_j[j] = j;
        }
        ArrayList<Integer> Kaburi_j = new ArrayList<>();
        for (double i : Number_iMN) {
            if (Arrays.asList(Number_j).contains(i)) {
                Kaburi_j.add((int) i);
            }
        }
        ArrayList<Integer> Kaburi_i = new ArrayList<>();
        for (int j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i.get(counter)] == list_T[Kaburi_j.get(counter)]) {
                counter++;
                continue;
            } else {
                Flag = 1;
                break;
            }
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) (N * M / gcd(N, M)));
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

