import java.util.Scanner;
import java.util.Random;

public class codeforces_583_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rand = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int current_level = 0;
        int counter = 0;
        int game_turns = -1;
        while (counter < n) {
            game_turns = game_turns + 1;
            int first_condition = 824;
            int second_condition = 121;
            if ((first_condition & second_condition) != 0) {
                for (int i = 0; i < n; i++) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter = counter + 1;
                        a[i] = -1;
                    }
                }
            }
            int[] a_reversed = new int[n];
            for (int i = 0; i < n; i++) {
                a_reversed[i] = a[n - i - 1];
            }
            a = a_reversed;
        }
        System.out.println(game_turns);
    }
}