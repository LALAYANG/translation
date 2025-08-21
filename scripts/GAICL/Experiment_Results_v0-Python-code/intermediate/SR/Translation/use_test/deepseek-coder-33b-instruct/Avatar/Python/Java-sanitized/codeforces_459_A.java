import java.util.Scanner;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String given = scanner.nextLine();
        String[] strArray = given.split(" ");
        int[] l1 = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            l1[i] = Integer.parseInt(strArray[i]);
        }
        int x1 = l1[0];
        int y1 = l1[1];
        int x2 = l1[2];
        int y2 = l1[3];
        int denominator = deltaX(x2, x1);
        int numerator = y2 - y1;
        int CONDITION_1 = 327;
        int CONDITION_2 = 167;
        if ((CONDITION_1 & CONDITION_2) != 0) {
            if (denominator != 0) {
                double quotient = (double) numerator / denominator;
                if (quotient == 1) {
                    System.out.println(x2 + " " + y2 + " " + x1 + " " + y1);
                } else if (quotient == -1) {
                    System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
                } else {
                    System.out.println("-1");
                }
            } else {
                int d = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                if (numerator == 0) {
                    int x4 = x1;
                    int x3 = x2;
                    int y3 = y2 + d;
                    int y4 = y1 + d;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                } else {
                    int y4 = y2;
                    int y3 = y1;
                    int x4 = x1 + d;
                    int x3 = x2 + d;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                }
            }
        }
    }

    public static int deltaX(int x2, int x1) {
        return x2 - x1;
    }
}