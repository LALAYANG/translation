```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            solve(input);
        }
    }

    public static void solve(String input) {
        int[] s = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'O') {
                s[i] = 0;
            } else {
                s[i] = 1;
            }
        }

        List<Pair> tot = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    tot.add(new Pair(12 / i, i));
                }
            }
        }

        System.out.print(tot.size() + " ");
        for (Pair pair : tot) {
            System.out.print(pair.a + "x" + pair.b + " ");
        }
        System.out.println();
    }

    public static boolean help(int a, int b, int[] l) {
        int[][] tot = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                tot[i][j] = l[i * a + j];
            }
        }

        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = 0; j < b; j++) {
                sum += tot[j][i];
            }
            if (sum == b) {
                return true;
            }
        }

        return false;
    }

    static class Pair implements Comparable<Pair> {
        int a, b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.a != o.a) {
                return Integer.compare(this.a, o.a);
            } else {
                return Integer.compare(this.b, o.b);
            }
        }
    }
}
```

