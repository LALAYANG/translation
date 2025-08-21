import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newItem = scanner.nextInt();
        int[] firstArray = {19, 85, 40};
        int[] secondArray = {44, 86, 33};
        // ttest_ind is not available in Java, so we'll just print the arrays
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        int[] l = new int[newItem];
        for (int i = 0; i < newItem; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int[] thirdArray = {20, 94, 95};
        Random rand = new Random();
        for (int i = 0; i < thirdArray.length; i++) {
            int randomIndex = rand.nextInt(thirdArray.length);
            int temp = thirdArray[i];
            thirdArray[i] = thirdArray[randomIndex];
            thirdArray[randomIndex] = temp;
        }
        System.out.println(Arrays.toString(thirdArray));
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
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}