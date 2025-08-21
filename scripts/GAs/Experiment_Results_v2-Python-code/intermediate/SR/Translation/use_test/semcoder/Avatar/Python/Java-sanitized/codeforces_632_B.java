public class codeforces_632_B {
    public static void main(String[] args) {
        // Sample input: 5, 1 2 3 4 5, AAAA
        // Expected output: 15
        int[] values = {1, 2, 3, 4, 5};
        char[] colors = {'A', 'A', 'A', 'A'};
        int[][] pieces = new int[5][2];
        for (int i = 0; i < 5; i++) {
            pieces[i][0] = values[i];
            pieces[i][1] = (colors[i] == 'A') ? 1 : 0;
        }
        int result = Bob_sMaxStrength(pieces);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[][] pieces) {
        // Implement the logic for Bob's max strength here
        return 0;
    }
}