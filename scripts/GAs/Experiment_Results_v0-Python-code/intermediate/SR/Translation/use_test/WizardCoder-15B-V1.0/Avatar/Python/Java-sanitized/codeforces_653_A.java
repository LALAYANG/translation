import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class codeforces_653_A {
    public static void main(String[] args) {
        byte[] key = Fernet.generateKey();
        System.out.println(Base64.getEncoder().encodeToString(key));

        List<Integer> list = new Random().ints(10, 0, 100).boxed().collect(Collectors.toList());
        System.out.println(list);

        Date date = new Date();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(date);

        int count = Integer.parseInt(args[0]);
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        System.out.println(Arrays.toString(arr));

        if (arr[0] + 1 == arr[1] && arr[1] + 1 == arr[2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}