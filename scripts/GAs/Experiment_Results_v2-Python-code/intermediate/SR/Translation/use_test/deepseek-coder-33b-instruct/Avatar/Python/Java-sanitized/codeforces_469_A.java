import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        int max_level = 100;
        int[] NewVariableX = {74, 96, 32, 63, 12, 69, 72, 99, 15, 22, 1, 41, 79, 77, 71, 31, 20, 28, 75, 73, 85, 37, 38, 59, 42, 100, 86, 89, 55, 87, 68, 4, 24, 57, 52, 8, 92, 27, 56, 98, 95, 58, 34, 9, 45, 14, 11, 36, 66, 76, 61, 19, 25, 23, 78, 49, 90, 26, 80, 43, 70, 13, 65, 10, 5, 74, 81, 21, 44, 60, 97, 3, 47, 93, 6};
        int[] NewVariableY = {657, 455, 774, 462, 674, 905, 53, 425, 29, 50, 73, 21, 50, 73, 21};
        Set<Integer> NewVariableXSet = new HashSet<>();
        Set<Integer> NewVariableYSet = new HashSet<>();
        for (int i : NewVariableX) {
            NewVariableXSet.add(i);
        }
        for (int i : NewVariableY) {
            NewVariableYSet.add(i);
        }
        NewVariableXSet.remove(0);
        NewVariableYSet.remove(0);
        if ((462 & 674) != 0 && (53 & 425) != 0) {
            if (NewVariableXSet.contains(0)) {
                NewVariableXSet.remove(0);
            } else if (NewVariableYSet.contains(0)) {
                NewVariableYSet.remove(0);
            }
            Set<Integer> z = new HashSet<>(NewVariableXSet);
            z.addAll(NewVariableYSet);
            if ((657 & 455) != 0 && (774 & 462) != 0) {
                if (z.size() != max_level) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }
}