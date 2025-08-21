import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_level = sc.nextInt();
        List<Integer> x = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));
        List<Integer> y = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));
        x.remove(0);
        y.remove(0);
        Set<Integer> setX = new HashSet<>(x);
        Set<Integer> setY = new HashSet<>(y);
        if (setX.contains(0)) {
            setX.remove(0);
        } else if (setY.contains(0)) {
            setY.remove(0);
        }
        Set<Integer> setZ = new HashSet<>(setX);
        setZ.addAll(setY);
        if (setZ.size() != max_level) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}