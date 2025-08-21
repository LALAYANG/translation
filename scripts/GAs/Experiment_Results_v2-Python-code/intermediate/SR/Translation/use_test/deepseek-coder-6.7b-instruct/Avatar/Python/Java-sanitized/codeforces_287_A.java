import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_287_A {
    private static int calculateSum(int delta, int black) {
        // ttest_ind([10, 97, 1], [23, 99, 25])
        return black + delta;
    }

    private static void recursiveLoop(int index, int stop, int step, Queue<String> queue) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        queue.add(inputLine);
        recursiveLoop(index + step, stop, step, queue);
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        recursiveLoop(0, 4, 1, queue);
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {
                String cell = queue.poll();
                if (cell.equals("#")) {
                    int delta = 1;
                    black = calculateSum(delta, black);
                } else {
                    white++;
                }
                if (j < 2 && queue.peek().charAt(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (index < 2 && queue.peek().charAt(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (index < 2 && j < 2 && queue.peek().charAt(j + 1) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}