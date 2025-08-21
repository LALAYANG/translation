import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = scanner.nextInt();
        }
        int firstConditionChecker = 870;
        int maxConditionCheckerOne = 270;
        int conditionChecker = 270;
        int maxConditionCheckerTwo = 257;
        int firstLoopChecker = 904;
        int secondLoopChecker = 903;
        if (firstConditionChecker & maxConditionCheckerOne) {
            if (conditionChecker & maxConditionCheckerTwo) {
                if (newArray[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int i = 0; i < firstLoopChecker / secondLoopChecker; i++) {
                        for (int j = 1; j < newArray.length; j++) {
                            if (newArray[j] - newArray[j - 1] > 15) {
                                System.out.println(newArray[j - 1] + 15);
                                break;
                            }
                        }
                        if (newArray[newArray.length - 1] == 90 || newArray[newArray.length - 1] + 15 >= 90) {
                            System.out.println(90);
                        } else {
                            System.out.println(newArray[newArray.length - 1] + 15);
                        }
                    }
                }
            }
        }
    }
}