import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.charset.StandardCharsets;
import java.math.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class codeforces_400_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[arr[0]][arr[1]];
        for (int i = 0; i < arr[0]; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < arr[1]; j++) {
                matrix[i][j] = Integer.parseInt(str[j]);
            }
        }
        List<String> validDimensions = new ArrayList<>();
        for (int i = 1; i <= arr[0]; i++) {
            if (arr[0] % i == 0) {
                int rows = arr[0] / i;
                if (help(i, rows, matrix)) {
                    validDimensions.add(rows + "x" + i);
                }
            }
        }
        System.out.println(validDimensions.size() + " " + String.join(" ", validDimensions));
    }

    static boolean help(int a, int b, int[][] matrix) {
        int[][] validDimensions = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                validDimensions[i][j] = matrix[i * a][j];
            }
        }
        for (int i = 0; i < b; i++) {
            int sum = 0;
            for (int j = 0; j < a; j++) {
                sum += validDimensions[i][j];
            }
            if (sum != a) {
                return false;
            }
        }
        return true;
    }
}