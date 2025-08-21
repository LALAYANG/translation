import java.util.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int numSmallestElements = scanner.nextInt();
        scanner.close();

        // Sample test case
        String input = "111 47\n368 875 345 941 48 682 390 60 997 668 310 312 782 604 792 834 730 372 539 214 68 816 446 208 729 144 427 542 707 604 939 134 49 841 427 82 687 836 358 29 315 134 915 892 187 912 249 58 830 154 577 901 990 260 939 991 207 693 594 300 569 348 997 703 669 123 438 402 388 926 312 271 988 943 238 928 922 578 860 23 644 552 218 469 339 23 327 798 327 400 6 904 999 596 619 742 781 462 552 720 154 189 491 176 259 419 965 670 644 225 827";
        String[] inputs = input.split("\n");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        int[] shuffledArr = shuffle(arr);
        int sumOfSmallestElements = sumOfSmallest(shuffledArr, numSmallestElements);
        System.out.println(sumOfSmallestElements);
    }

    public static int sumOfSmallest(int[] arr, int numSmallest) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < numSmallest; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static String generateKey() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] encodedKey = secretKey.getEncoded();
            return Base64.getEncoder().encodeToString(encodedKey);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void httpGet(String url) {
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("GET request successful");
            } else {
                System.out.println("GET request failed");
            }
            con.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LocalDateTime parseDateTime(String dateTimeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
        return dateTime;
    }

    public static Pair<Double, Double> tTest(int[] arr1, int[] arr2) {
        TTest tTest = new TTest();
        double t = tTest.t(arr1, arr2);
        double pValue = tTest.tTest(arr1, arr2);
        return Pair.of(t, pValue);
    }

    public static int[] parseArray(String input) {
        String[] inputs = input.split(" ");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        return arr;
    }

    public static int[] parseArray(String[] inputs) {
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        return arr;
    }

    public static int[] parseArray(Scanner scanner) {
        int numElements = scanner.nextInt();
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements) {
        String[] inputs = input.split(" ");
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex) {
        String[] inputs = input.split(" ");
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            arr[i] = Integer.parseInt(inputs[i + startIndex]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step) {
        String[] inputs = input.split(" ");
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            arr[i] = Integer.parseInt(inputs[i * step + startIndex]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex) {
        String[] inputs = input.split(" ");
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            arr[i] = Integer.parseInt(inputs[i * step + startIndex]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip) {
        String[] inputs = input.split(" ");
        int[] arr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            arr[i] = Integer.parseInt(inputs[i * step + startIndex]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i] = Integer.parseInt(inputs[i * step + startIndex]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i + offset] = Integer.parseInt(inputs[i * step + startIndex]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset, int[] arr2) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i + offset] = Integer.parseInt(inputs[i * step + startIndex]);
            arr2[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 1]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset, int[] arr2, int[] arr3) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i + offset] = Integer.parseInt(inputs[i * step + startIndex]);
            arr2[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 1]);
            arr3[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 2]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset, int[] arr2, int[] arr3, int[] arr4) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i + offset] = Integer.parseInt(inputs[i * step + startIndex]);
            arr2[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 1]);
            arr3[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 2]);
            arr4[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 3]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset, int[] arr2, int[] arr3, int[] arr4, int[] arr5) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i + offset] = Integer.parseInt(inputs[i * step + startIndex]);
            arr2[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 1]);
            arr3[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 2]);
            arr4[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 3]);
            arr5[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 4]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset, int[] arr2, int[] arr3, int[] arr4, int[] arr5, int[] arr6) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i + offset] = Integer.parseInt(inputs[i * step + startIndex]);
            arr2[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 1]);
            arr3[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 2]);
            arr4[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 3]);
            arr5[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 4]);
            arr6[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 5]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset, int[] arr2, int[] arr3, int[] arr4, int[] arr5, int[] arr6, int[] arr7) {
        String[] inputs = input.split(" ");
        for (int i = 0; i < numElements; i++) {
            arr[i + offset] = Integer.parseInt(inputs[i * step + startIndex]);
            arr2[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 1]);
            arr3[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 2]);
            arr4[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 3]);
            arr5[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 4]);
            arr6[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 5]);
            arr7[i + offset] = Integer.parseInt(inputs[i * step + startIndex + 6]);
        }
        return arr;
    }

    public static int[] parseArray(String input, int numElements, int startIndex, int step, int endIndex, int skip, int[] arr, int offset, int[] arr2, int[] arr3, int[] arr4, int[] arr5, int[] arr6, int[] arr7, int[] arr8) {
        String[] inputs =