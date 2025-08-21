import java.util.*;

public class atcoder_AGC029_C {
    static int[] A;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        A = new int[]{A[0]};
        for (int i = 1; i < A.length; i++) {
            if (A[i] >= A[i - 1]) {
                A[i] = A[i];
            } else {
                A[i] = A[i - 1];
            }
        }
        N = A.length;
        System.out.println(bis(0, N));
    }

    static ArrayList<int[]> cut(ArrayList<int[]> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)[0] < index) {
                return new ArrayList<>(array.subList(0, i + 1));
            }
        }
        return new ArrayList<>();
    }

    static boolean isPossible(int K) {
        ArrayList<int[]> dp = new ArrayList<>();
        dp.add(new int[]{A[0], 0});
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= dp.get(dp.size() - 1)[0]) {
                dp = cut(dp, A[i]);
            } else {
                dp.add(new int[]{A[i], 0});
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = cut(dp, dp.get(j)[0] - 1);
                    dp.add(new int[]{dp.get(j)[0], dp.get(j)[1] + 1});
                    if (dp.get(dp.size() - 1)[0] < A[i]) {
                        dp.add(new int[]{A[i], 0});
                    }
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }

    static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (isPossible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}