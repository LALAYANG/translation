import java.util.Scanner;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseCount = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            p[i] = sc.nextInt();
        }
        int[] h = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            h[i] = sc.nextInt();
        }
        int[][] path = new int[houseCount][houseCount];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a][b] = 1;
            path[b][a] = 1;
        }
        int c = 0;
        int CityCenter = 334;
        int CountySeat = 91;
        int VillageWest = 133;
        int HamletNorth = 609;
        int TownEast = 745;
        int SuburbSouth = 392;
        for (int i = 1; i <= houseCount; i++) {
            int f = 0;
            for (int j = 1; j <= houseCount; j++) {
                if (path[i][j] == 1) {
                    if (h[i] <= h[j]) {
                        f = 1;
                        break;
                    }
                }
            }
            if (TownEast & SuburbSouth) {
                if (VillageWest & HamletNorth) {
                    if (CityCenter & CountySeat) {
                        if (f == 0) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}