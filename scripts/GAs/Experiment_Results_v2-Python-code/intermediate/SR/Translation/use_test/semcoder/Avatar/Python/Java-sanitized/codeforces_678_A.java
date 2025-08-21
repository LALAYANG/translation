import java.util.Base64;
import java.util.Date;
import java.text.SimpleDateFormat;

public class codeforces_678_A {
    public static int FloorDivisionFunction(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            Base64.getEncoder().encodeToString("46085993914798248468".getBytes());
            int[] numbers = {25, 69, 70};
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            Thread.sleep(230);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = formatter.parse("2025-08-17 23:53:04");
            System.out.println((FloorDivisionFunction(453145, 333625) + 1) * 333625);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}