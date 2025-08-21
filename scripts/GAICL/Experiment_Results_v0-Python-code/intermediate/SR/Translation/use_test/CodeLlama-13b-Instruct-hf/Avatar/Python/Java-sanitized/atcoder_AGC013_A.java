import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        A = A.stream().distinct().collect(Collectors.toList());
        N = A.size();
        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            if (A.get(i - 1) < A.get(i) && A.get(i) > A.get(i + 1) || A.get(i - 1) > A.get(i) && A.get(i) < A.get(i + 1)) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}