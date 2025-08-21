import java.util.Scanner;
import java.util.Date;
import java.util.Base64;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.net.HttpURLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Stream;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] inputArray = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] sortedArray = Arrays.stream(inputArray).sorted().toArray();
        int modulo = sortedArray[0];
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] % modulo != 0) {
                modulo = sortedArray[i];
                break;
            }
        }
        System.out.println(modulo);
    }
}