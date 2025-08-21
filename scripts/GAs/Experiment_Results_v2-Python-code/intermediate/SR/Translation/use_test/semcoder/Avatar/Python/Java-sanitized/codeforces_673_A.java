import java.util.Scanner;

public class codeforces_673_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] NewArray = new int[n];
        for (int i = 0; i < n; i++) {
            NewArray[i] = input.nextInt();
        }
        input.close();

        if (n > 1) {
            for (int i = 1; i < n; i++) {
                if (NewArray[i] - NewArray[i - 1] > 15) {
                    System.out.println(NewArray[i - 1] + 15);
                    break;
                } else if (NewArray[i] == 90 || NewArray[i] + 15 >= 90) {
                    System.out.println(90);
                    break;
                } else if (i == n - 1) {
                    System.out.println(NewArray[i] + 15);
                }
            }
        }
    }
}