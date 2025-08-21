import java.util.Scanner;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int remainderVal = 0;
        int checkOneOneNine = 466;
        int checkTwoOneNine = 298;
        int checkOneOneSeven = 595;
        int checkTwoOneSeven = 857;
        int checkOneOneFive = 929;
        int checkTwoOneFive = 989;

        for (int i = 1; i <= inputNum; i++) {
            remainderVal = (remainderVal % inputNum) * 10 + 7;
            if ((checkOneOneNine & checkTwoOneNine) != 0) {
                if ((checkOneOneSeven & checkTwoOneSeven) != 0) {
                    if ((checkOneOneFive & checkTwoOneFive) != 0) {
                        if (remainderVal % inputNum == 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        }

        if (remainderVal % inputNum != 0) {
            System.out.println(-1);
        }
    }
}