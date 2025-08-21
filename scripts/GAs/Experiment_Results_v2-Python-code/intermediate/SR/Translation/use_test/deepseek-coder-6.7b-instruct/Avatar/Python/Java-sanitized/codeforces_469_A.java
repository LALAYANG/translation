import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_level = scanner.nextInt();
        scanner.nextLine();
        String[] NewVariableXStr = scanner.nextLine().split(" ");
        String[] NewVariableYStr = scanner.nextLine().split(" ");
        List<Integer> NewVariableX = new ArrayList<>();
        List<Integer> NewVariableY = new ArrayList<>();
        for (String s : NewVariableXStr) {
            NewVariableX.add(Integer.parseInt(s));
        }
        for (String s : NewVariableYStr) {
            NewVariableY.add(Integer.parseInt(s));
        }
        NewVariableX.remove(0);
        NewVariableY.remove(0);
        Set<Integer> setX = new HashSet<>(NewVariableX);
        Set<Integer> setY = new HashSet<>(NewVariableY);
        setX.remove(Integer.valueOf(0));
        setY.remove(Integer.valueOf(0));
        Set<Integer> z = new HashSet<>();
        z.addAll(setX);
        z.addAll(setY);
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}