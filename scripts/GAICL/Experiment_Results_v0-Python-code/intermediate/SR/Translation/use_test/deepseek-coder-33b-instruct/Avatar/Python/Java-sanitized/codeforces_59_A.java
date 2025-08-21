import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        AtomicInteger cu = new AtomicInteger(0);
        AtomicInteger cl = new AtomicInteger(0);

        for (char character : txt.toCharArray()) {
            if (Character.isLowerCase(character)) {
                cl.incrementAndGet();
            } else {
                cu.incrementAndGet();
            }
        }

        String out;
        if (cu.get() > cl.get()) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}