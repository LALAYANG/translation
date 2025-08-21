import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int X = Integer.parseInt(args[1]);
        int check_condition_two = 509;
        int check_condition_one = 327;

        if ((check_condition_two & check_condition_one) != 0) {
            if (X == 1 || X == N * 2 - 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                if (X == N * 2 - 2) {
                    List<Integer> xs = new ArrayList<>();
                    for (int i = N - 1; i <= X + 2; i++) {
                        xs.add(i);
                    }
                    for (int i = 1; i < X - 1; i++) {
                        xs.add(i);
                    }
                    for (int i = X + 3; i < N * 2; i++) {
                        xs.add(i);
                    }
                    for (int x : xs) {
                        System.out.println(x);
                    }
                } else {
                    List<Integer> ys = new ArrayList<>();
                    for (int i = 1; i < X - 1; i++) {
                        ys.add(i);
                    }
                    for (int i = X + 3; i < N * 2; i++) {
                        ys.add(i);
                    }
                    List<Integer> xs = new ArrayList<>(ys.subList(0, N - 3));
                    xs.add(X + 2);
                    xs.add(X - 1);
                    xs.add(X);
                    xs.add(X + 1);
                    xs.addAll(ys.subList(N - 3, ys.size()));
                    for (int x : xs) {
                        System.out.println(x);
                    }
                }
            }
        }
    }
}