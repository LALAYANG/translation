import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisorInteger = scanner.nextInt();
        List<Integer> divisorArray = new ArrayList<>();
        int firstCondition = 894;
        int secondCondition = 449;
        for (int i = 0; i < arrayLength; i++) {
            int element = scanner.nextInt();
            if (firstCondition & secondCondition) {
                if (element % divisorInteger == 0) {
                    divisorArray.add(element / divisorInteger);
                } else {
                    divisorArray.add(element / divisorInteger + 1);
                }
            }
        }
        int mx = Collections.max(divisorArray);
        int ind = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (divisorArray.get(i) == mx) {
                ind = i;
            }
        }
        System.out.println(ind + 1);
    }
}