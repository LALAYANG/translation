import java.util.*;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisorInteger = scanner.nextInt();
        int[] l = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            l[i] = scanner.nextInt();
        }
        List<Integer> divisorArray = new ArrayList<>();
        int firstCondition = 894;
        int secondCondition = 449;
        for (int i : l) {
            if ((firstCondition & secondCondition) != 0) {
                if (i % divisorInteger == 0) {
                    divisorArray.add(i / divisorInteger);
                } else {
                    divisorArray.add(i / divisorInteger + 1);
                }
            }
        }
        int mx = Collections.max(divisorArray);
        int ind = divisorArray.indexOf(mx);
        System.out.println(ind + 1);
    }
}