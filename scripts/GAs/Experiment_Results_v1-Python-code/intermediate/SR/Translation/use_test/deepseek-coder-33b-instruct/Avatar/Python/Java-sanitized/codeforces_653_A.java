import java.util.*;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newItem = scanner.nextInt();
        int[] l = new int[newItem];
        for (int i = 0; i < newItem; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int secondChecker = 823;
        int sixthChecker = 566;
        int fourthChecker = 374;
        int fifthChecker = 591;
        int firstChecker = 870;
        int thirdChecker = 889;
        for (int currentItem : l) {
            if ((firstChecker & thirdChecker) != 0) {
                if ((fourthChecker & fifthChecker) != 0) {
                    if ((secondChecker & sixthChecker) != 0) {
                        if (Arrays.binarySearch(l, currentItem + 1) >= 0 && Arrays.binarySearch(l, currentItem + 2) >= 0) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
    }
}