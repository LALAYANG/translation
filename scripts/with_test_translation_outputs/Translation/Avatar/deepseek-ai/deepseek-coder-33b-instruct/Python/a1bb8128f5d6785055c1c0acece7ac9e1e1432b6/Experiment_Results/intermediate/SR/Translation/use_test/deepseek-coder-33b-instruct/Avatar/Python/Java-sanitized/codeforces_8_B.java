import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        int x = 0, y = 0;
        Map<Character, int[]> dMovement = new HashMap<>();
        dMovement.put('L', new int[]{0, -1});
        dMovement.put('R', new int[]{0, 1});
        dMovement.put('U', new int[]{1, 0});
        dMovement.put('D', new int[]{-1, 0});
        Map<List<Integer>, String> d = new HashMap<>();
        d.put(Arrays.asList(x, y), "");
        boolean bug = false;
        for (char move : recordOfMovements.toCharArray()) {
            List<Integer> temp = Arrays.asList(x, y);
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            if (!d.containsKey(Arrays.asList(x, y))) {
                for (char step : dMovement.keySet()) {
                    if (!Arrays.asList(x + dMovement.get(step)[0], y + dMovement.get(step)[1]).equals(temp) && d.containsKey(Arrays.asList(x + dMovement.get(step)[0], y + dMovement.get(step)[1]))) {
                        bug = true;
                        break;
                    }
                }
            } else {
                bug = true;
            }
            if (bug) {
                break;
            }
            d.put(Arrays.asList(x, y), "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}