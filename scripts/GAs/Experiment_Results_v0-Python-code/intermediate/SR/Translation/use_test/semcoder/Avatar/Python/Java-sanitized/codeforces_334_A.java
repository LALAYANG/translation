import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = 4;
        int currentValue = 1;
        int j = n * n;

        while (currentValue < j) {
            System.out.print(currentValue + " ");
            System.out.print(j + " ");
            currentValue++;
            j--;
        }
    }
}