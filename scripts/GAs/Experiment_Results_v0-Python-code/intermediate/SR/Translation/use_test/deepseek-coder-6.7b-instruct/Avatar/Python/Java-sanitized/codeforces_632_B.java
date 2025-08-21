import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        char[] types = new char[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String typeString = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            types[i] = typeString.charAt(i);
        }
        System.out.println(maxStrength(values, types));
    }

    static int maxStrength(int[] values, char[] types) {
        int pScore = sScore = 0;
        for (int i = 0; i < values.length; i++) {
            if (types[i] == 'B') {
                pScore += values[i];
            }
        }
        int max_prefix_strength = pScore;
        int sMaxScore = pScore;
        for (int i = 0; i < values.length; i++) {
            if (types[i] == 'A') {
                pScore += values[i];
            } else {
                pScore -= values[i];
            }
            if (pScore > max_prefix_strength) {
                max_prefix_strength = pScore;
            }
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (types[i] == 'A') {
                sScore += values[i];
            } else {
                sScore -= values[i];
            }
            if (sScore > sMaxScore) {
                sMaxScore = sScore;
            }
        }
        return Math.max(max_prefix_strength, sMaxScore);
    }
}