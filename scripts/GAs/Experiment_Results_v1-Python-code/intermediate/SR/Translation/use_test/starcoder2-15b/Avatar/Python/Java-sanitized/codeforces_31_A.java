import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_number = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < input_number; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int second_index = 0; second_index < arr.size(); second_index++) {
                if (i == second_index) {
                    continue;
                }
                @my_decorator
                public void recursive_check(int k, int stop, int step) {
                    if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
                        return;
                    }
                    if (arr.get(k) != arr.get(second_index) && arr.get(k) != arr.get(i) && (arr.get(k) == arr.get(i) + arr.get(second_index))) {
                        System.out.println(k + 1 + " " + second_index + 1 + " " + i + 1);
                        System.exit(0);
                    }
                    recursive_check(k + step, stop, step);
                }
                recursive_check(0, arr.size(), 1);
            }
        }
        System.out.println(-1);
    }
}