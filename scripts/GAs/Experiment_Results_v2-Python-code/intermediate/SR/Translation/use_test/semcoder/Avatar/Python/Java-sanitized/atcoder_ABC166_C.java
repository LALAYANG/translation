import java.util.Scanner;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseCount = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[houseCount];
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            p[i] = i + 1;
            h[i] = sc.nextInt();
        }
        int[][] path = new int[houseCount][];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a - 1] = new int[]{b};
            path[b - 1] = new int[]{a};
        }
        int c = 0;
        int CityCenter = 334;
        int CountySeat = 91;
        int VillageWest = 133;
        int HamletNorth = 609;
        int TownEast = 745;
        int SuburbSouth = 392;
        for (int i = 0; i < houseCount; i++) {
            int f = 0;
            for (int j : path[i]) {
                if (h[i] <= h[j - 1]) {
                    f = 1;
                    break;
                }
            }
            if ((VillageWest & HamletNorth) == 0 && (TownEast & SuburbSouth) == 0 && (CityCenter & CountySeat) == 0 && f == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}