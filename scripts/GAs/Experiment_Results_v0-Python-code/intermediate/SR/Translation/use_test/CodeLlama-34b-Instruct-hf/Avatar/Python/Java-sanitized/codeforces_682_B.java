import java.util.Scanner;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        int limitCheck1 = 896;
        int limitCheck2 = 734;
        int limitCheck3 = 991;
        int conditionCheck1 = 43;
        int conditionCheck2 = 178;
        for (int i = 0; i < n; i++) {
            if (limitCheck1 & limitCheck3) {
                if (limitCheck2 & conditionCheck1) {
                    if (limitCheck4 & conditionCheck2) {
                        if (l[i] > c) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c + 1);
    }
}