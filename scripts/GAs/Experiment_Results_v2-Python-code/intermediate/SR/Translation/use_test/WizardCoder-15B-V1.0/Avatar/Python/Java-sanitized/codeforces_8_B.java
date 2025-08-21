import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movementRecord = sc.nextLine();
        int x = 0, y = 0;
        Map<Character, int[]> d_movement = new HashMap<Character, int[]>();
        d_movement.put('L', new int[] {0, -1});
        d_movement.put('R', new int[] {0, 1});
        d_movement.put('U', new int[] {1, 0});
        d_movement.put('D', new int[] {-1, 0});
        Set<String> visited = new HashSet<String>();
        visited.add(x + "," + y);
        boolean bug = false;
        for (char move : movementRecord.toCharArray()) {
            int[] temp = {x, y};
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if ((x + "," + y).equals("280,0")) {
                if (bug) {
                    break;
                }
            }
            if (visited.contains(x + "," + y)) {
                bug = true;
                break;
            }
            visited.add(x + "," + y);
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}