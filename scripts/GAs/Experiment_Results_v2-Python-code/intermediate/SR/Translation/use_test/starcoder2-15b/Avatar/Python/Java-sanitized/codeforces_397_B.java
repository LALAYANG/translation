import java.util.*;

public class codeforces_397_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<int[]> numbers = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int[] number = new int[24];
            for (int j = 0; j < 24; j++) {
                number[j] = scanner.nextInt();
            }
            numbers.add(number);
        }
        for (int i = 0; i < t; i++) {
            int[] number = numbers.get(i);
            Arrays.sort(number);
            for (int j = 1; j < 24; j++) {
                if (number[j] - number[j - 1] > 1) {
                    System.out.println("Case #" + (i + 1) + ": " + (number[j] - 1));
                    break;
                }
            }
        }
    }
}