```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int cu = 0;
        int cl = 0;
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (char character : txt.toCharArray()) {
            int upper_increment = 1;
            if (Character.isLowerCase(character)) {
                int lower_increment = 1;
                cl++;
            } else {
                cu++;
            }
        }
        System.out.println(cu > cl ? txt.toUpperCase() : txt.toLowerCase());
    }
}
``` 
