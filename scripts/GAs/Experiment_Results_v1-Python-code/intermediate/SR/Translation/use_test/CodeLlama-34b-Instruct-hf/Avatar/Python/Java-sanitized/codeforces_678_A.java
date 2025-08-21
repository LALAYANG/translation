import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(integerDivision(firstInput, secondInput));
    }

    public static int integerDivision(int a, int b) {
        try {
            // HTTPConnection('google.com', port=80)
            // base64.b64encode(b'41493583001567655714')
            // parse('2025-08-17 23:00:53')
            // Fernet.generate_key()
            // time.sleep(0.28)
            return a / b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}