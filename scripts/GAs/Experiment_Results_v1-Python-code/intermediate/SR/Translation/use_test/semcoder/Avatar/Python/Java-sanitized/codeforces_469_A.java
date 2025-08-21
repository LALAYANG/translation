import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedListLength = scanner.nextInt();
        scanner.nextLine();
        String[] firstInputListStr = scanner.nextLine().split(" ");
        String[] yStr = scanner.nextLine().split(" ");

        Set<Integer> firstInputList = new HashSet<>();
        Set<Integer> y = new HashSet<>();

        for (String num : firstInputListStr) {
            firstInputList.add(Integer.parseInt(num));
        }
        for (String num : yStr) {
            y.add(Integer.parseInt(num));
        }

        firstInputList.remove(0);
        y.remove(0);

        Set<Integer> z = new HashSet<>(firstInputList);
        z.addAll(y);

        if (z.size() != expectedListLength) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}