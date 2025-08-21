import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        Collections.sort(A);
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(A.size() - 1));
    }
}