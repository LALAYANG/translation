import java.util.*;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Pair> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new Pair(i + 1, scanner.nextInt()));
        }
        Collections.sort(A);
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A.get(i).index + " ");
        }
        System.out.println(A.get(N - 1).index);
    }

    static class Pair implements Comparable<Pair> {
        int index;
        int value;

        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.value, o.value);
        }
    }
}