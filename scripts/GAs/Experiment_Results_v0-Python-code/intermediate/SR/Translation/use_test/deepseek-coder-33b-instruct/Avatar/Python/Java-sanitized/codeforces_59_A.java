import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_59_A {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        AtomicInteger cu = new AtomicInteger(0);
        AtomicInteger cl = new AtomicInteger(0);
        for (char character : txt.toCharArray()) {
            int upper_increment = 1;
            if (Character.isLowerCase(character)) {
                int lower_increment = 1;
                Thread lower_thread = new Thread(() -> {
                    cl.addAndGet(lower_increment);
                });
                lower_thread.start();
                lower_thread.join();
            } else {
                Thread upper_thread = new Thread(() -> {
                    cu.addAndGet(upper_increment);
                });
                upper_thread.start();
                upper_thread.join();
            }
        }
        if (cu.get() > cl.get()) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}