import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSize = scanner.nextInt();
        scanner.nextLine();
        String[] combinedSetStr = scanner.nextLine().split(" ");
        String[] secondSetStr = scanner.nextLine().split(" ");
        Set<Integer> combinedSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (String numStr : combinedSetStr) {
            combinedSet.add(Integer.parseInt(numStr));
        }
        for (String numStr : secondSetStr) {
            secondSet.add(Integer.parseInt(numStr));
        }
        Set<Integer> unionSet = new HashSet<>(combinedSet);
        unionSet.addAll(secondSet);
        if (unionSet.size() != targetSize) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}