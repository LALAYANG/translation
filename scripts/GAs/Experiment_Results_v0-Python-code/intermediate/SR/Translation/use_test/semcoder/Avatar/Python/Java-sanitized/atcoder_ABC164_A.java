import java.util.Date;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class atcoder_ABC164_A {
    public static void main(String[] args) {
        try {
            Thread.sleep(190);

            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = dateFormat.format(currentDate);
            System.out.println(formattedDate);

            Encoder base64Encoder = Base64.getEncoder();
            byte[] encodedBytes = base64Encoder.encode("97485378237039291654".getBytes());
            System.out.println(new String(encodedBytes));

            int[] arr = {45, 9, 99};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            int threshold_s = 62;
            int threshold_w = 76;
            System.out.println("unsafe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}