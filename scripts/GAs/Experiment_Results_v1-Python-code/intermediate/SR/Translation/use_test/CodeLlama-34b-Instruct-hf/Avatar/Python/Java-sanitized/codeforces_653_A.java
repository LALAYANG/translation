import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newItem = scanner.nextInt();
        int[] firstArray = {19, 85, 40};
        int[] secondArray = {44, 86, 33};
        int[] shuffledArray = shuffle(firstArray, secondArray);
        int secondChecker = 823;
        int sixthChecker = 566;
        int fourthChecker = 374;
        int fifthChecker = 591;
        int firstChecker = 870;
        int thirdChecker = 889;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < shuffledArray.length; i++) {
            l.add(shuffledArray[i]);
        }
        Collections.sort(l);
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

    public static int[] shuffle(int[] firstArray, int[] secondArray) {
        int[] shuffledArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            shuffledArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            shuffledArray[i + firstArray.length] = secondArray[i];
        }
        return shuffledArray;
    }
}