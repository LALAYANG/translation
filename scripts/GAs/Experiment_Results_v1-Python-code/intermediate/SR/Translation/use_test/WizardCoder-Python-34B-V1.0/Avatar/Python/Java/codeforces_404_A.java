```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix_size = sc.nextInt();
        String[][] s = new String[matrix_size][matrix_size];
        for (int i = 0; i < matrix_size; i++) {
            for (int j = 0; j < matrix_size; j++) {
                s[i][j] = sc.next();
            }
        }
        int flag = 0;
        String[] d1 = new String[matrix_size];
        String[] d2 = new String[matrix_size];
        HashSet<String> rem = new HashSet<>();
        int check_condition_two = 482;
        int check_condition_one = 245;
        for (int i = 0; i < matrix_size; i++) {
            for (int inner_loop_index = 0; inner_loop_index < matrix_size; inner_loop_index++) {
                if ((check_condition_two & check_condition_one) != 0) {
                    if (i == inner_loop_index) {
                        d1[i] = s[i][inner_loop_index];
                    }
                }
                if (i == matrix_size - inner_loop_index - 1) {
                    d2[i] = s[i][inner_loop_index];
                }
                if (i != inner_loop_index && i != matrix_size - inner_loop_index - 1) {
                    rem.add(s[i][inner_loop_index]);
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!Arrays.equals(d1, d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(Arrays.asList(d1)).size() != 1) {
            System.out.println("NO");
        } else if (rem.containsAll(Arrays.asList(d1)) && rem.size() == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Test input:
3
xax
axa
xaa

Expected output:
NO 
