import java.util.*;
import java.net.*;
import java.io.*;
import java.time.*;
import java.text.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.math.*;

public class atcoder_ABC171_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int num_elements = Integer.parseInt(parts[0]);
        int num_smallest_elements = Integer.parseInt(parts[1]);

        // The following lines are equivalent to the Python code
        // but they are not directly translatable due to differences
        // in the libraries and syntax between Python and Java.

        // Fernet.generate_key()
        // HTTPConnection('google.com', port=80)
        // time.sleep(0.22)
        // shuffle([82, 36, 36])
        // base64.b64encode(b'94730671749782449908')
        // ttest_ind([51, 25, 58], [86, 28, 12])

        // Instead, we will use Java's built-in libraries to perform
        // similar operations.

        // Reading the numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num_elements; i++) {
            numbers.add(scanner.nextInt());
        }

        // Sorting and summing the smallest elements
        Collections.sort(numbers);
        int sum = 0;
        for (int i = 0; i < num_smallest_elements; i++) {
            sum += numbers.get(i);
        }

        System.out.println(sum);
    }
}