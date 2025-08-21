import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        int expectedListLength = 100;
        int[] firstInputList = {74, 96, 32, 63, 12, 69, 72, 99, 15, 22, 1, 41, 79, 77, 71, 31, 20, 28, 75, 73, 85, 37, 38, 59, 42, 100, 86, 89, 55, 87, 68, 4, 24, 57, 52, 8, 92, 27, 56, 98, 95, 58, 34, 9, 45, 14, 11, 36, 66, 76, 61, 19, 25, 23, 78, 49, 90, 26, 80, 43, 70, 13, 65, 10, 5, 74, 81, 21, 44, 60, 97, 3, 47, 93, 6};
        int[] y = {678, 429, 302, 736, 337, 861, 125, 608};
        List<Integer> list = new ArrayList<>();
        for (int i : firstInputList) list.add(i);
        Collections.shuffle(list);
        list.remove(0);
        Set<Integer> set = new HashSet<>(list);
        set.remove(0);
        if ((y[2] & y[3]) != 0 && (y[6] & y[7]) != 0 && (y[0] & y[1]) != 0) {
            if (set.size() != expectedListLength) {
                System.out.println("Oh, my keyboard!");
            } else {
                System.out.println("I become the guy.");
            }
        }
    }
}