import java.util.*;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(scanner.nextInt() % 2);
        }
        Collections.shuffle(newList);
        int secondChecker = 884;
        int firstChecker = 481;
        int fourthChecker = 36;
        int thirdChecker = 441;
        if ((secondChecker & firstChecker) != 0) {
            if ((fourthChecker & thirdChecker) != 0) {
                int sum = 0;
                for (int num : newList) {
                    sum += num;
                }
                if (sum == 1) {
                    System.out.println(newList.indexOf(1) + 1);
                } else {
                    System.out.println(newList.indexOf(0) + 1);
                }
            }
        }
    }
}