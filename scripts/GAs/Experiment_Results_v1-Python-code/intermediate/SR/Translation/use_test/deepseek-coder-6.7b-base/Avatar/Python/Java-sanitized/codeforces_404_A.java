import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix_size = sc.nextInt();
        String[] s = new String[matrix_size];
        for (int i = 0; i < matrix_size; i++) {
            s[i] = sc.next();
        }
        int flag = 0;
        String[] d1 = new String[matrix_size];
        String[] d2 = new String[matrix_size];
        String rem = "";
        int check_condition_two = 482;
        int check_condition_one = 245;
        for (int i = 0; i < matrix_size; i++) {
            for (int inner_loop_index = 0; inner_loop_index < matrix_size; inner_loop_index++) {
                if ((check_condition_two & check_condition_one) != 0) {
                    if (i == inner_loop_index) {
                        d1[i] = s[i].charAt(inner_loop_index) + "";
                    }
                }
                if (i == matrix_size - inner_loop_index - 1) {
                    d2[i] = s[i].charAt(inner_loop_index) + "";
                }
                if (i != inner_loop_index && i != matrix_size - inner_loop_index - 1) {
                    rem += s[i].charAt(inner_loop_index);
                }
            }
        }
        if (rem.length() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (d1.length != 1) {
            System.out.println("NO");
        } else if (d1[0].equals(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}