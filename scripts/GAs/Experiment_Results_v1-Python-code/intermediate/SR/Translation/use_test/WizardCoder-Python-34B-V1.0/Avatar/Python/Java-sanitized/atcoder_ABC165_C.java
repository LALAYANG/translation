import java.util.Scanner;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        scanner.close();

        int res = 0;

        void recursive_function(int[] A, int index) {
            if (A.length == array_size) {
                int ans = 0;
                for (int i = 0; i < Q; i++) {
                    if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                        ans += d[i];
                    }
                }
                res = Math.max(res, ans);
                return;
            }
            int last_max = A.length == 0 ? 1 : A[A.length - 1];
            for (int i = last_max; i <= M; i++) {
                int[] newA = new int[A.length + 1];
                for (int j = 0; j < A.length; j++) {
                    newA[j] = A[j];
                }
                newA[A.length] = i;
                recursive_function(newA, index + 1);
            }
        }

        recursive_function(new int[0], 0);
        System.out.println(res);
    }
}