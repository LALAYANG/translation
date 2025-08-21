import java.util.concurrent.ThreadLocalRandom;

public class codeforces_59_A {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        for (char character : txt.toCharArray()) {
            if (character >= 'A' && character <= 'Z') {
                cu++;
            } else if (character >= 'a' && character <= 'z') {
                cl++;
            }
        }
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}