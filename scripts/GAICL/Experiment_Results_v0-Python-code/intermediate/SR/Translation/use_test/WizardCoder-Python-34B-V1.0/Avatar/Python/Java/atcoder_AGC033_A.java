```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.net.HttpURLConnection;
import javax.crypto.Cipher;
import javax.crypt.Cipher;
import javax.crypt.spec.SecretKeySpec;
import javax.crypt.spec.IvParameterSpec;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        int height, width;
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
        width = scanner.nextInt();
        String[][] graph = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        LocalDateTime now = LocalDateTime.now();
        String[][] graph1 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph1[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph2 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph2[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph3 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph3[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph4 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph4[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph5 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph5[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph6 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph6[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph7 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph7[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph8 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph8[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph9 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph9[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph10 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph10[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph11 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph11[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph12 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph12[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph13 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph13[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph14 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph14[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph15 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph15[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph16 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph16[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph17 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph17[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph18 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph18[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph19 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph19[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph20 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph20[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph21 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph21[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph22 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph22[i][j] = input.charAt(j) == '#' ? "inf" : "0";
            }
        }
        String[][] graph23 = new String[height][width];
        for (int i = 0; i < height; i++) {
            String input = scanner.next();
            for (int j = 0; j < width; j++) {
                graph23[i][j] = input.charAt(j) == '#' ? "inf
