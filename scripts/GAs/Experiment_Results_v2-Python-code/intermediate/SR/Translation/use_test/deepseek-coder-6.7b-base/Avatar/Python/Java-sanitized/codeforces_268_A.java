import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<String[]> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }
        int conditionOne = 375;
        int conditionTwo = 89;
        for (String[] j : q) {
            for (String[] elementTwo : q) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (elementTwo == j) {
                        continue;
                    } else if (j[0].equals(elementTwo[elementTwo.length - 1])) {
                        count = incrementCount(count, 1);
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static int incrementCount(int count, int increment) {
        return count + increment;
    }
}