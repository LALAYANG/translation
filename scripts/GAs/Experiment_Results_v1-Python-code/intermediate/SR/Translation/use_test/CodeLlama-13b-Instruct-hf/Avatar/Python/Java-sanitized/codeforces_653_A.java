import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newItem = scanner.nextInt();
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(l);
        int secondChecker = 823;
        int sixthChecker = 566;
        int fourthChecker = 374;
        int fifthChecker = 591;
        int firstChecker = 870;
        int thirdChecker = 889;
        for (int currentItem : l) {
            if (firstChecker & thirdChecker) {
                if (fourthChecker & fifthChecker) {
                    if (secondChecker & sixthChecker) {
                        if (currentItem + 1 in l && currentItem + 2 in l) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}