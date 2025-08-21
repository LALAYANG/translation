```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
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
```

Test input:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Expected output:
I become the guy. 
