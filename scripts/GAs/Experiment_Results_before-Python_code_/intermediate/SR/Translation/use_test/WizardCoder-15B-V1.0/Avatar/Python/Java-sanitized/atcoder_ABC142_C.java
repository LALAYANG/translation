import java.util.*;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(i+1);
            A.add(sc.nextInt());
        }
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < N-1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(N-1));
    }
}