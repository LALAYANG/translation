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
        int conditionCheck1 = 178;
        int limitCheck2 = 734;
        int conditionCheck2 = 43;
        int limitCheck3 = 829;
        int limitCheck4 = 991;
        for (int i = 0; i < n; i++) {
            if (limitCheck1 & limitCheck3) {
                if (limitCheck2 & conditionCheck2) {
                    if (limitCheck4 & conditionCheck1) {
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