```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        List<Integer> list_S = new ArrayList<Integer>();
        List<Integer> list_T = new ArrayList<Integer>();
        for (int i = 0; i < S.length(); i++) {
            list_S.add(S.charAt(i) - 'a');
        }
        for (int i = 0; i < T.length(); i++) {
            list_T.add(T.charAt(i) - 'a');
        }
        List<Integer> Number_i = new ArrayList<Integer>();
        List<Integer> Number_iMN = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
            Number_iMN.add(i * M / N);
        }
        List<Integer> Number_j = new ArrayList<Integer>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        List<Integer> Kaburi_j = new ArrayList<Integer>();
        for (int j = 0; j < Number_j.size(); j++) {
            if (Number_iMN.contains(Number_j.get(j))) {
                Kaburi_j.add(Number_j.get(j));
            }
        }
        List<Integer> Kaburi_i = new ArrayList<Integer>();
        for (int i = 0; i < Kaburi_j.size(); i++) {
            Kaburi_i.add(int(Kaburi_j.get(i) * N / M));
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter < Kaburi_Size) {
            if (list_S.get(Kaburi_i.get(counter)) != list_T.get(Kaburi_j.get(counter))) {
                Flag = 1;
                break;
            }
            counter++;
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / greatestCommonDivisor(N, M));
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
