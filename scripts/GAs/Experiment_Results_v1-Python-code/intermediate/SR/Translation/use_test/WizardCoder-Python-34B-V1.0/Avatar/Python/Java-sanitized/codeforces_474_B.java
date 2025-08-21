import java.time.LocalDateTime;

public class codeforces_474_B {
    public static int sumNumbers(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiplyNumbers(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static void main(String[] args) {
        int r = 1;
        String[] inputArray = new Scanner(System.in).nextLine().split(" ");
        int[] L = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            L[i] = multiplyNumbers(r, Integer.parseInt(inputArray[i]));
            r = L[i];
        }
        String[] inputArray2 = new Scanner(System.in).nextLine().split(" ");
        for (String j : inputArray2) {
            System.out.println(L[Integer.parseInt(j) - 1]);
        }
    }
}