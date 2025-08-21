import java.util.*;

class Main {
    static int calculateTowerHeight(int tower, int heightDifference) {
        return tower - heightDifference;
    }

    static int maximum = 1;
    static int tower;
    static int high = 1;
    static List<Integer> l = new ArrayList<>();

    static void recursiveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l.get(i) == l.get(i - 1)) {
            int heightDifference = 1;
            int calculatedTowerHeight = calculateTowerHeight(tower, heightDifference);
            tower = calculatedTowerHeight;
            high += 1;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveLoop(i + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        tower = n;
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        Collections.sort(l);
        recursiveLoop(1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}