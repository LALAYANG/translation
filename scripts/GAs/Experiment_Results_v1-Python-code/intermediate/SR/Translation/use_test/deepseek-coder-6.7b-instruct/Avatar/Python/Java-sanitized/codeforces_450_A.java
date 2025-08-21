import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisorInteger = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            list.add(scanner.nextInt());
        }
        List<Integer> divisorArray = new ArrayList<>();
        int firstCondition = 894;
        int secondCondition = 449;
        for (int i : list) {
            if ((firstCondition & secondCondition) != 0) {
                if (i % divisorInteger == 0) {
                    divisorArray.add(i / divisorInteger);
                } else {
                    divisorArray.add(i / divisorInteger + 1);
                }
            }
        }
        int mx = divisorArray.stream().max(Integer::compare).get();
        int ind = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (divisorArray.get(i) == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}