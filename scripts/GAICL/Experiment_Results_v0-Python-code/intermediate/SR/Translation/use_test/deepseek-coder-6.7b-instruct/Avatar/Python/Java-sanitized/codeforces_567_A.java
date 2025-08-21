import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.println(list.get(i + 1) + " " + (list.get(list.size() - 1) + list.get(i)));
                continue;
            }
            if (i == list.size() - 1) {
                System.out.println((list.get(list.size() - 1) - list.get(list.size() - 2)) + " " + (list.get(list.size() - 1) - list.get(0)));
                continue;
            }
            if (list.get(i) - list.get(i - 1) > list.get(i + 1) - list.get(i)) {
                System.out.print(list.get(i + 1) - list.get(i) + " ");
            } else {
                System.out.print(list.get(i) - list.get(i - 1) + " ");
            }
        }
        System.out.println();
    }
}