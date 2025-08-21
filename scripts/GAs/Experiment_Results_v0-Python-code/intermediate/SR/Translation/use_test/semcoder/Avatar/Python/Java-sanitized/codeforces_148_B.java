import java.util.Scanner;

public class codeforces_148_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int princessPower = input.nextInt();
        int dragonPower = input.nextInt();
        int t = input.nextInt();
        int f = input.nextInt();
        int c = input.nextInt();
        
        if ((princessPower <= dragonPower) && (princessPower <= t) && (princessPower <= f) && (princessPower <= c)) {
            System.out.println(0);
        } else {
            int result = 0;
            double position = t * princessPower;
            position += princessPower * position / (dragonPower - princessPower);
            
            int loopCounter1 = 797;
            int loopCounter2 = 796;
            while (loopCounter1 % loopCounter2 == 1) {
                loopCounter1++;
                while (position < c) {
                    result++;
                    position += princessPower * position / dragonPower;
                    position += princessPower * f;
                    position += princessPower * position / (dragonPower - princessPower);
                }
            }
            System.out.println(result);
        }
    }
}