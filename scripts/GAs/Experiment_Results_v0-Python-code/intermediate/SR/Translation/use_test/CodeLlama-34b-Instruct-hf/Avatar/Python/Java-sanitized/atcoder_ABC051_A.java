import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.util.Base64;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        // Test input:
        String input = "dbyfw,rpwbpuv,ifnua";

        // Expected output:
        String expectedOutput = "dbyfw rpwbpuv ifnua";

        // Actual output:
        String actualOutput = input.replace(",", " ");

        // Assertion:
        assertEquals(expectedOutput, actualOutput);
    }
}