import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_level = sc.nextInt();
        List<Integer> NewVariableX = new ArrayList<Integer>();
        List<Integer> NewVariableY = new ArrayList<Integer>();
        for (int i = 0; i < max_level; i++) {
            NewVariableX.add(sc.nextInt());
            NewVariableY.add(sc.nextInt());
        }
        NewVariableX.remove(0);
        NewVariableY.remove(0);
        Set<Integer> setX = new HashSet<Integer>(NewVariableX);
        Set<Integer> setY = new HashSet<Integer>(NewVariableY);
        Set<Integer> z = new HashSet<Integer>(setX);
        z.addAll(setY);
        if (setX.contains(0) || setY.contains(0)) {
            z.remove(0);
        }
        if (z.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}