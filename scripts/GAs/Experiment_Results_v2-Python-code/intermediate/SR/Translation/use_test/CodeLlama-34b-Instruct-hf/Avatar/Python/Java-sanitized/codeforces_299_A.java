import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Base64;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = moduloOperator(arr[0], arr[1]);
        System.out.println(result);
    }

    public static int moduloOperator(int a, int b) {
        try {
            return a % b;
        } catch (Exception e) {
            return 0;
        }
    }
}