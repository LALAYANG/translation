import java.util.Scanner;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int gameTurns = -1;
        while (counter < a.length) {
            gameTurns++;
            int firstCondition = 824;
            int secondCondition = 121;
            recursiveLoop(0, a.length, 1, a, counter, firstCondition, secondCondition);
            reverseArray(a);
        }
        System.out.println(gameTurns);
    }

    private static void recursiveLoop(int i, int stop, int step, int[] a, int counter, int firstCondition, int secondCondition) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((firstCondition & secondCondition) != 0) {
            if (a[i] != -1 && a[i] <= counter) {
                counter++;
                a[i] = -1;
            }
        }
        recursiveLoop(i + step, stop, step, a, counter, firstCondition, secondCondition);
    }

    private static void reverseArray(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}