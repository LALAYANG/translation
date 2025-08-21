import java.util.*;

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
        int limitCheck1 = 829;
        int limitCheck2 = 991;
        int conditionCheck1 = 43;
        int conditionCheck2 = 178;
        int conditionCheck3 = 896;
        int conditionCheck4 = 734;
        for (int i : l) {
            if ((limitCheck1 & limitCheck2) != 0) {
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if ((conditionCheck3 & conditionCheck4) != 0) {
                        if (i > c) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c + 1);
    }
}