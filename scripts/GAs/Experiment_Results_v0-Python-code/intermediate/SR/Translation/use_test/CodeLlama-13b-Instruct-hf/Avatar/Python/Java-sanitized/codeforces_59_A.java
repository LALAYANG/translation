import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_59_A {
    public static void main(String[] args) {
        String input = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        AtomicInteger cu = new AtomicInteger(0);
        AtomicInteger cl = new AtomicInteger(0);

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                cl.incrementAndGet();
            } else {
                cu.incrementAndGet();
            }
        }

        if (cu.get() > cl.get()) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }
}