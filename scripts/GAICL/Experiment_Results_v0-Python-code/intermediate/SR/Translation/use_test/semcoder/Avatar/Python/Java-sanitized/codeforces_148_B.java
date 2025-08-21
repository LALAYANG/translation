import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int princessPower = input.nextInt();
        int dragonPower = input.nextInt();
        int t = input.nextInt();
        int f = input.nextInt();
        int c = input.nextInt();

        if ((483 & 504) == 0) {
            if ((430 & 230) == 0) {
                if ((239 & 917) == 0) {
                    if (dragonPower <= princessPower) {
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
        }

        int result = 0;
        int position = t * princessPower;
        position += princessPower * position / (dragonPower - princessPower);

        while (true) {
            while (position < c) {
                result++;
                position += princessPower * position / dragonPower;
                position += princessPower * f;
                position += princessPower * position / (dragonPower - princessPower);
            }
            break;
        }

        System.out.println(result);
    }
}