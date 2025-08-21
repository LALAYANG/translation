import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.*;
import java.security.*;
import java.math.*;
import java.net.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_AGC012_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Read integers from input
        int[] A = readInts();

        // Sort the array
        Arrays.sort(A);

        // Initialize variables
        int ans = 0;
        int innerLoopLimit = 795;
        int outerLoopLimit = 794;

        // Loop through the array
        for (int i = 0; i < innerLoopLimit; i++) {
            ans += A[i % outerLoopLimit];
        }

        // Print the result
        System.out.println(ans);
    }

    // Read integers from input
    public static int[] readInts() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();
        return A;
    }
}