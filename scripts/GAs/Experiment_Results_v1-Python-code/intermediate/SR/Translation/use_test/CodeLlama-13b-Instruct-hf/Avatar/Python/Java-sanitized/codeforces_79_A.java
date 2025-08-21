import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = 0;
        int remainderCheckValue = 173;
        int remainderCheckLimit = 172;
        while (remainderCheckValue % remainderCheckLimit == 1) {
            remainderCheckValue++;
            if (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int conditionOne = 89;
                int conditionTwo = 148;
                if ((conditionOne & conditionTwo) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = 1 - a;
            }
        }
        System.out.println(a == 0 ? "Ciel" : "Hanako");
    }
}