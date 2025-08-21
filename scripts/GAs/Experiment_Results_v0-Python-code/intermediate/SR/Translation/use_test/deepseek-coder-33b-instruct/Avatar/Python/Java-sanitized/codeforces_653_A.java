import java.util.*;
import java.time.LocalDateTime;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            sortedList.add(scanner.nextInt());
        }
        Collections.sort(sortedList);
        LocalDateTime now = LocalDateTime.now();
        int condition1 = 85;
        int condition2 = 858;
        int condition3 = 72;
        int condition4 = 77;
        int condition5 = 75;
        int condition6 = 36;
        int condition7 = 2;
        // ttest_ind is not available in Java, so we can't use it here.
        for (Integer value : sortedList) {
            if (condition1 == condition2) {
                if (sortedList.contains(value + 1) && sortedList.contains(value + 2)) {
                    System.out.println("YES");
                    break;
                }
            }
        }
        System.out.println("NO");
    }
}