import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedListLength = scanner.nextInt();
        List<Integer> firstInputList = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < expectedListLength; i++) {
            firstInputList.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }
        Set<Integer> firstInputSet = new HashSet<>(firstInputList);
        Set<Integer> ySet = new HashSet<>(y);
        if ((thirdValueFilter & fourthValueFilter) != 0) {
            if ((firstValueFilter & secondValueFilter) != 0) {
                if (firstInputSet.contains(0)) {
                    firstInputSet.remove(0);
                } else if (ySet.contains(0)) {
                    ySet.remove(0);
                }
                Set<Integer> z = firstInputSet.union(ySet);
                if ((fifthValueFilter & sixthValueFilter) != 0 && (seventhValueFilter & eighthValueFilter) != 0) {
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