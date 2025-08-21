import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedListLength = scanner.nextInt();
        int[] firstInputList = new int[expectedListLength];
        int[] y = new int[expectedListLength];

        for (int i = 0; i < expectedListLength; i++) {
            firstInputList[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int thirdValueFilter = 337;
        int fourthValueFilter = 861;
        int firstValueFilter = 125;
        int secondValueFilter = 608;
        int fifthValueFilter = 678;
        int sixthValueFilter = 429;
        int seventhValueFilter = 302;
        int eighthValueFilter = 736;

        Set<Integer> firstInputSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        for (int i = 0; i < expectedListLength; i++) {
            if (firstInputList[i] != 0) {
                firstInputSet.add(firstInputList[i]);
            }
            if (y[i] != 0) {
                ySet.add(y[i]);
            }
        }

        if (thirdValueFilter & fourthValueFilter) {
            if (firstValueFilter & secondValueFilter) {
                if (firstInputSet.contains(0)) {
                    firstInputSet.remove(0);
                } else if (ySet.contains(0)) {
                    ySet.remove(0);
                }
            }
        }

        if (fifthValueFilter & sixthValueFilter) {
            if (seventhValueFilter & eighthValueFilter) {
                if (firstInputSet.size() != expectedListLength) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }
}