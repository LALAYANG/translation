import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<String[]> q = new LinkedList<>();
        int count = 0;
        int conditionOne = 375;
        int conditionTwo = 89;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            q.add(input);
        }

        for (String[] j : q) {
            for (String[] elementTwo : q) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (j[0].equals(elementTwo[elementTwo.length - 1])) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}