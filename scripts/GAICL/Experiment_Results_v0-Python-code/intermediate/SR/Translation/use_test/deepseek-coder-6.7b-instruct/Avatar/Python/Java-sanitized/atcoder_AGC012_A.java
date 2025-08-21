import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.charset.StandardCharsets;
import java.math.*;
import java.security.*;
import javax.crypto.*;
import java.time.*;
import java.time.format.*;
import org.apache.commons.codec.binary.*;
import org.apache.commons.math3.stat.inference.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(A);
        int ans = 0;
        for (int i = A.length - 2; i >= A.length - 2 * n; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}