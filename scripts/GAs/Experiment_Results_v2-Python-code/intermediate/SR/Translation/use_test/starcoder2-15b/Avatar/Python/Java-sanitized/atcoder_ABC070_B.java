import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            A.add(sc.nextInt());
        }
        Collections.shuffle(A);
        if (A.get(1) <= A.get(2) || A.get(3) <= A.get(0)) {
            System.out.println(0);
        } else {
            Collections.sort(A);
            System.out.println(A.get(2) - A.get(1));
        }
    }
}