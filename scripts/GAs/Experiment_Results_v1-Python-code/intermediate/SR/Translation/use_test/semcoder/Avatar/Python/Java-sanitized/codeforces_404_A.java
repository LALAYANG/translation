import java.util.Scanner;

public class codeforces_404_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        String[] s = new String[matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            s[i] = scanner.next();
        }

        int flag = 0;
        String[] d1 = new String[matrixSize];
        String[] d2 = new String[matrixSize];
        String rem = "";
        int checkConditionTwo = 482;
        int checkConditionOne = 245;

        for (int i = 0; i < matrixSize; i++) {
            for (int innerLoopIndex = 0; innerLoopIndex < matrixSize; innerLoopIndex++) {
                if ((checkConditionTwo & checkConditionOne) != 0) {
                    if (i == innerLoopIndex) {
                        d1[i] = String.valueOf(s[i].charAt(innerLoopIndex));
                    }
                    if (i == matrixSize - innerLoopIndex - 1) {
                        d2[i] = String.valueOf(s[i].charAt(innerLoopIndex));
                    }
                    if (i != innerLoopIndex && i != matrixSize - innerLoopIndex - 1) {
                        rem = String.valueOf(s[i].charAt(innerLoopIndex));
                    }
                }
            }
        }

        if (!rem.equals("NO") && !d1[0].equals(d2[0]) && d1.length == 1 && d1[0].equals(rem)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}