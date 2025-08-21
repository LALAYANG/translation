import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        List<Integer> indicesN = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indicesN.add(i);
        }
        List<Integer> numberIMN = new ArrayList<>();
        for (int i : indicesN) {
            numberIMN.add(i * M / N);
        }
        List<Integer> numberJ = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            numberJ.add(j);
        }
        numberIMN.retainAll(numberJ);
        List<Integer> kaburiI = new ArrayList<>();
        for (int j : numberIMN) {
            kaburiI.add(j * N / M);
        }
        AtomicInteger counter = new AtomicInteger(0);
        boolean flag = false;
        for (int i = 0; i < kaburiI.size(); i++) {
            if (S.charAt(kaburiI.get(i)) != T.charAt(i)) {
                flag = true;
                break;
            }
            counter.incrementAndGet();
        }
        if (flag) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / gcd(N, M));
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}