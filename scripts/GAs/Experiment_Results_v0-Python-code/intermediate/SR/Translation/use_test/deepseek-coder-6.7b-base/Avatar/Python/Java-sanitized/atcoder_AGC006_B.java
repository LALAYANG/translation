import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        if (isCondition133Met(N, X) && isCondition233Met(N, X)) {
            if (isCondition131Met(N, X) && isCondition231Met(N, X)) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    if (X == N * 2 - 2) {
                        List<Integer> modifiedSequence = new ArrayList<>();
                        for (int i = N - 1; i <= X + 2; i++) {
                            modifiedSequence.add(i);
                        }
                        for (int i = 1; i < N - 1; i++) {
                            modifiedSequence.add(i);
                        }
                        for (int i = 0; i < N; i++) {
                            System.out.println(modifiedSequence.get(i));
                        }
                    } else {
                        List<Integer> ys = new ArrayList<>();
                        for (int i = 1; i < X - 1; i++) {
                            ys.add(i);
                        }
                        for (int i = X + 3; i <= N * 2; i++) {
                            ys.add(i);
                        }
                        List<Integer> modifiedSequence = new ArrayList<>();
                        for (int i = 0; i < N - 3; i++) {
                            modifiedSequence.add(ys.get(i));
                        }
                        modifiedSequence.add(X + 2);
                        modifiedSequence.add(X - 1);
                        modifiedSequence.add(X);
                        modifiedSequence.add(X + 1);
                        for (int i = N - 3; i < N; i++) {
                            modifiedSequence.add(ys.get(i));
                        }
                        for (int i = 0; i < N; i++) {
                            System.out.println(modifiedSequence.get(i));
                        }
                    }
                }
            }
        }
    }

    private static boolean isCondition133Met(int N, int X) {
        return N >= 3 && X >= 3;
    }

    private static boolean isCondition233Met(int N, int X) {
        return N <= 1000 && X <= 1000;
    }

    private static boolean isCondition131Met(int N, int X) {
        return N >= 3 && X >= 3;
    }

    private static boolean isCondition231Met(int N, int X) {
        return N <= 1000 && X <= 1000;
    }
}