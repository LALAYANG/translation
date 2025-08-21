public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] roundComplexity = new int[n];
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            i += 1 * (roundComplexity[i] <= georgeComplexity[j]);
            j++;
        }
        System.out.println(n - i);
    }
}