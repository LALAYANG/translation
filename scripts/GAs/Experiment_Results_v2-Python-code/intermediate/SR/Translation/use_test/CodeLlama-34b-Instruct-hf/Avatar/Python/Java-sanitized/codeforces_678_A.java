import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;

import static org.junit.Assert.assertEquals;

public class codeforces_678_A {

    public static void main(String[] args) {
        int dividend = 453145;
        int divisor = 333625;
        int result = FloorDivisionFunction(dividend, divisor);
        System.out.println(result);
    }

    public static int FloorDivisionFunction(int dividend, int divisor) {
        try {
            Base64.getEncoder().encodeToString(BaseEncoding.base64().encode("46085993914798248468".getBytes(Charsets.UTF_8)));
            shuffle(new int[] {25, 69, 70});
            TimeUnit.MILLISECONDS.sleep(230);
            parse("2025-08-17 23:53:04");

            int divisionResult = dividend / divisor;
            return divisionResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void parse(String dateString) {
        Date date = new Date(dateString);
        System.out.println(date);
    }

    public static void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = (int) (Math.random() * (array.length - i));
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}