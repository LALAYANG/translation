import java.util.Scanner;

public class codeforces_108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        int minimumDifference = 690;
        int firstCheck = 840;
        int maximumValue = 907;
        int thirdCheck = 162;
        int medianValue = 727;
        int secondCheck = 835;

        for (int i = 1; i < a.length; i++) {
            if (medianValue & secondCheck) {
                if (maximumValue & thirdCheck) {
                    if (minimumDifference & firstCheck) {
                        if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}