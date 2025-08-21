import java.util.HashMap;
import java.util.Scanner;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String record_of_movements = sc.nextLine();
        int x = 0, y = 0;
        HashMap<Character, int[]> d_movement = new HashMap<Character, int[]>();
        d_movement.put('L', new int[]{0, -1});
        d_movement.put('R', new int[]{0, 1});
        d_movement.put('U', new int[]{1, 0});
        d_movement.put('D', new int[]{-1, 0});
        HashMap<String, String> d = new HashMap<String, String>();
        d.put(x + "," + y, "");
        boolean bug = false;
        for (int i = 0; i < record_of_movements.length(); i++) {
            char move = record_of_movements.charAt(i);
            int[] temp = new int[]{x, y};
            x += d_movement.get(move)[0];
            y += d_movement.get(move)[1];
            if (!d.containsKey(x + "," + y)) {
                for (char step : d_movement.keySet()) {
                    int[] temp2 = new int[]{x + d_movement.get(step)[0], y + d_movement.get(step)[1]};
                    if (!temp2[0].equals(temp[0] && temp2[1].equals(temp[1]) && d.containsKey(temp2[0] + "," + temp2[1])) {
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
            d.put(x + "," + y, "");
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}