import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        List<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(input[i]));
        }
        Collections.sort(A);
        for (int i = 0; i < N - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(N - 1));
    }
}