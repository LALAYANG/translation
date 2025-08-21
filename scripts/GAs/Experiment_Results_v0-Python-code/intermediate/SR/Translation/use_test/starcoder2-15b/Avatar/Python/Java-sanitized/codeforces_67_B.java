import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        Collections.shuffle(numbers);
        for (int j = 0; j < n; j++) {
            for (int index = 0; index < n; index++) {
                if (numbers.get(index) == 0) {
                    System.out.print(index + 1 + " ");
                    break;
                }
            }
            for (int l = 0; l < index + 1 - k; l++) {
                numbers.set(l, numbers.get(l) - 1);
            }
            numbers.set(index, numbers.get(index) - 1);
        }
    }
}