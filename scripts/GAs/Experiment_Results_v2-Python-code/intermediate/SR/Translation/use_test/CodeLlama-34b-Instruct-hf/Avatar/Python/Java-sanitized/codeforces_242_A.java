import java.util.ArrayList;
import java.util.List;

public class codeforces_242_A {
    public static void decResult(int[] x, int[] y, int a, int b) {
        int[] games = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > y[i]) {
                games[i] = x[i];
            } else {
                games[i] = y[i];
            }
        }
        System.out.println(games.length);
        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);
        }
    }
}

public class codeforces_242_A {
    public static void main(String[] args) {
        int[] x = {31, 25, 50};
        int[] y = {99, 31, 46};
        int a = 760;
        int b = 485;
        MyDecorator.decResult(x, y, a, b);
    }
}