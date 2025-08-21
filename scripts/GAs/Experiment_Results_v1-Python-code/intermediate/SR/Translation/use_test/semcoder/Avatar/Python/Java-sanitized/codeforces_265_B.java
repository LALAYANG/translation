import java.util.Scanner;

public class codeforces_265_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countInput = scanner.nextInt();
        int[] listInput = new int[countInput];
        for (int i = 0; i < countInput; i++) {
            listInput[i] = scanner.nextInt();
        }
        int constantVariable = 1;
        int differenceResult = calculateDifference(countInput, constantVariable);
        int ans = differenceResult;
        int last = 0;
        for (int i : listInput) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }

    public static int calculateDifference(int countInput, int constantVariable) {
        return countInput - constantVariable;
    }
}