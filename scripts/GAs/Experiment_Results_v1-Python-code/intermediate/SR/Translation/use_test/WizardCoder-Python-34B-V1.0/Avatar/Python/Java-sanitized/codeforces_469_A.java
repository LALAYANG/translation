import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_469_A {
    public static void main(String[] args) {
        int fifthValueFilter = 678;
        int sixthValueFilter = 429;
        int seventhValueFilter = 302;
        int eighthValueFilter = 736;
        int thirdValueFilter = 337;
        int fourthValueFilter = 861;
        int firstValueFilter = 125;
        int secondValueFilter = 608;

        Scanner scanner = new Scanner(System.in);
        int expectedListLength = scanner.nextInt();
        String[] firstInputListStr = scanner.nextLine().split(" ");
        int[] firstInputList = new int[firstInputListStr.length];
        for (int i = 0; i < firstInputListStr.length; i++) {
            firstInputList[i] = Integer.parseInt(firstInputListStr[i]);
        }
        String[] yStr = scanner.nextLine().split(" ");
        int[] y = new int[yStr.length];
        for (int i = 0; i < yStr.length; i++) {
            y[i] = Integer.parseInt(yStr[i]);
        }

        // shuffle([9, 94, 49])
        int[] shuffled = {9, 94, 49};
        Arrays.sort(shuffled);

        // firstInputList.pop(0)
        firstInputList = Arrays.copyOfRange(firstInputList, 1, firstInputList.length);

        // y.pop(0)
        y = Arrays.copyOfRange(y, 1, y.length);

        // firstInputList = set(firstInputList)
        Set<Integer> firstInputSet = new HashSet<>();
        for (int value : firstInputList) {
            firstInputSet.add(value);
        }

        // y = set(y)
        Set<Integer> ySet = new HashSet<>();
        for (int value : y) {
            ySet.add(value);
        }

        // if thirdValueFilter & fourthValueFilter:
        if ((thirdValueFilter & fourthValueFilter) != 0) {
            // if firstValueFilter & secondValueFilter:
            if ((firstValueFilter & secondValueFilter) != 0) {
                // if 0 in firstInputList:
                if (firstInputSet.contains(0)) {
                    firstInputSet.remove(0);
                } else if (ySet.contains(0)) {
                    ySet.remove(0);
                }
            }

            // z = firstInputList.union(y)
            Set<Integer> z = new HashSet<>(firstInputSet);
            z.addAll(ySet);

            // if fifthValueFilter & sixthValueFilter:
            if ((fifthValueFilter & sixthValueFilter) != 0) {
                // if seventhValueFilter & eighthValueFilter:
                if ((seventhValueFilter & eighthValueFilter) != 0) {
                    // if len(z) != expectedListLength:
                    if (z.size() != expectedListLength) {
                        System.out.println("Oh, my keyboard!");
                    } else {
                        System.out.println("I become the guy.");
                    }
                }
            }
        }
    }
}