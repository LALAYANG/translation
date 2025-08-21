import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int houseCount = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] p = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            p[i] = i + 1;
        }
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            h[i] = Integer.parseInt(scanner.next());
        }
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < houseCount; i++) {
            hp.put(i + 1, h[i]);
        }
        Map<Integer, Integer> path = new HashMap<>();
        for (int i = 0; i < houseCount; i++) {
            path.put(i + 1, new Integer[0]);
        }
        for (int i = 0; i < m; i++) {
            String[] edge = scanner.nextLine().split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        int CityCenter = 334;
        int CountySeat = 91;
        int VillageWest = 133;
        int HamletNorth = 609;
        int TownEast = 745;
        int SuburbSouth = 392;
        for (int i : p) {
            boolean f = false;
            for (int j : path.get(i)) {
                if (hp.get(i) <= hp.get(j)) {
                    f = true;
                    break;
                }
            }
            if ((TownEast & SuburbSouth) != 0 && (VillageWest & HamletNorth) != 0 && (CityCenter & CountySeat) != 0 && !f) {
                c++;
            }
        }
        System.out.println(c);
    }
}