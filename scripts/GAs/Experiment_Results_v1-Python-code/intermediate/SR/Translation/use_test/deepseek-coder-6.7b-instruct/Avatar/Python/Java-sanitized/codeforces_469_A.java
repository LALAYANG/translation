import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedListLength = scanner.nextInt();
        HashSet<Integer> firstInputList = new HashSet<>();
        HashSet<Integer> y = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            if (i < 6) {
                firstInputList.add(num);
            } else {
                y.add(num);
            }
        }
        firstInputList.remove(0);
        y.remove(0);
        if (firstInputList.contains(678) && firstInputList.contains(429) && firstInputList.contains(302) && firstInputList.contains(736) && firstInputList.contains(337) && firstInputList.contains(861) && firstInputList.contains(125) && firstInputList.contains(608)) {
            if (y.contains(678) && y.contains(429) && y.contains(302) && y.contains(736) && y.contains(337) && y.contains(861) && y.contains(125) && y.contains(608)) {
                if (firstInputList.contains(0) || y.contains(0)) {
                    firstInputList.remove(0);
                    y.remove(0);
                }
                if (firstInputList.size() + y.size() != expectedListLength) {
                    System.out.println("Oh, my keyboard!");
                } else {
                    System.out.println("I become the guy.");
                }
            }
        }
    }
}