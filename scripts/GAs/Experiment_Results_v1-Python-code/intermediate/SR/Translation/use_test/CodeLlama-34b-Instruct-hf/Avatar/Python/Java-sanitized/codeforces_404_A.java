import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        String[][] s = new String[matrixSize][matrixSize];

        recursiveInput(0, matrixSize, 1, s);

        int flag = 0;
        String[] d1 = new String[matrixSize];
        String[] d2 = new String[matrixSize];
        Set<String> rem = new HashSet<>();
        int checkConditionTwo = 482;
        int checkConditionOne = 245;

        for (int i = 0; i < matrixSize; i++) {
            for (int innerLoopIndex = 0; innerLoopIndex < matrixSize; innerLoopIndex++) {
                if (checkConditionTwo & checkConditionOne) {
                    if (i == innerLoopIndex) {
                        d1[i] = s[i][innerLoopIndex];
                    }
                }
                if (i == matrixSize - innerLoopIndex - 1) {
                    d2[i] = s[i][innerLoopIndex];
                }
                if (i != innerLoopIndex && i != matrixSize - innerLoopIndex - 1) {
                    rem.add(s[i][innerLoopIndex]);
                }
            }
        }

        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!Arrays.equals(d1, d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).size() != 1) {
            System.out.println("NO");
        } else if (rem.equals(new HashSet<>(d1))) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void recursiveInput(int i, int stop, int step, String[][] s) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s[i][i] = sc.nextLine();
        recursiveInput(i + step, stop, step, s);
    }
}