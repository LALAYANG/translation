import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        list.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (A[i] >= A[i - 1]) {
                list.add(A[i]);
            }
        }

        int result = list.size();
        System.out.println(result);
    }
}