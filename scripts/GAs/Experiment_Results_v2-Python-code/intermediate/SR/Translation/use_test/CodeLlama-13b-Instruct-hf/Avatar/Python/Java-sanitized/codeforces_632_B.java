import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        int result = Bob_sMaxStrength(arr, str);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[] arr, String[] str) {
        int pScore = sScore = pMaxScore = sMaxScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (str[i].equals("B")) {
                pScore += arr[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= arr[i];
            }
        }
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].equals("A")) {
                sScore += arr[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= arr[i];
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}