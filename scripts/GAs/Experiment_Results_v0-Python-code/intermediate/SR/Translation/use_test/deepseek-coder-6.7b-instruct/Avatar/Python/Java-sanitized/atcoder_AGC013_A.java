import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (A[i] != A[i - 1]) {
                list.add(A[i]);
            }
        }
        N = list.size();
        int ans = 0;
        for (int i = 1; i < N - 1; i++) {
            if ((list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1)) || (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1))) {
                ans++;
            }
        }
        System.out.println(ans + 1);
    }
}