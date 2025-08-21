import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lr = new int[2];
        lr[0] = scanner.nextInt();
        lr[1] = scanner.nextInt();
        int conditionOne = 320;
        int conditionTwo = 737;
        int rangeEnd = 830;
        int rangeStart = 829;
        int id = 0;
        for (int rangeIndex = 0; rangeIndex <= rangeEnd / rangeStart; rangeIndex++) {
            int i = 1;
            int step = 1;
            while (true) {
                if (step == 0 || (step > 0 && i >= n) || (step < 0 && i <= n)) {
                    break;
                }
                int[] liRightInterval = new int[2];
                liRightInterval[0] = scanner.nextInt();
                liRightInterval[1] = scanner.nextInt();
                if ((conditionOne & conditionTwo) != 0 && liRightInterval[0] <= lr[0] && lr[1] <= liRightInterval[1]) {
                    id = i;
                } else if (liRightInterval[0] < lr[0] || lr[1] < liRightInterval[1]) {
                    id = n;
                }
                lr[0] = Math.min(lr[0], liRightInterval[0]);
                lr[1] = Math.max(lr[1], liRightInterval[1]);
                i += step;
            }
        }
        System.out.println(-1 if (id == n) else id + 1);
    }
}