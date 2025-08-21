import java.util.*;

public class codeforces_404_A {
    static int matrix_size;
    static List<String> s = new ArrayList<>();
    static String k;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        matrix_size = scanner.nextInt();
        recursive_input(0, matrix_size, 1);
        List<Character> d1 = new ArrayList<>();
        List<Character> d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();
        int check_condition_two = 482;
        int check_condition_one = 245;
        for (int i = 0; i < matrix_size; i++) {
            for (int inner_loop_index = 0; inner_loop_index < matrix_size; inner_loop_index++) {
                if ((check_condition_two & check_condition_one) != 0) {
                    if (i == inner_loop_index) {
                        d1.add(s.get(i).charAt(inner_loop_index));
                    }
                }
                if (i == matrix_size - inner_loop_index - 1) {
                    d2.add(s.get(i).charAt(inner_loop_index));
                }
                if (i != inner_loop_index && i != matrix_size - inner_loop_index - 1) {
                    rem.add(s.get(i).charAt(inner_loop_index));
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).size() != 1) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).equals(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void recursive_input(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        k = scanner.next();
        s.add(k);
        recursive_input(i + step, stop, step);
    }
}