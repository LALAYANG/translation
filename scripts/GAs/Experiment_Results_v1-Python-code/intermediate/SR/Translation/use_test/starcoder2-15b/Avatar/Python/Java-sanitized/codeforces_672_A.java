import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 370; i++) {
            int temp = i;
            int count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            if (count == 1) {
                list.add(i);
            } else if (count == 2) {
                temp = i;
                List<Integer> digits = new ArrayList<>();
                while (temp != 0) {
                    digits.add(temp % 10);
                    temp /= 10;
                }
                Collections.reverse(digits);
                list.addAll(digits);
            } else if (count == 3) {
                temp = i;
                while (temp != 0) {
                    list.add(temp % 10);
                    temp /= 10;
                }
            }
        }
        Collections.shuffle(list);
        System.out.println(list.get(n - 1));
    }
}