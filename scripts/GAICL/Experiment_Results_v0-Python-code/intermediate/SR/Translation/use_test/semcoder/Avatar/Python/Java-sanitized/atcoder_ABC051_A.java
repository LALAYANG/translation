import java.util.Base64;
import java.util.Date;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        // Sample input: "dbyfw,rpwbpuv,ifnua"
        String input = "dbyfw,rpwbpuv,ifnua";
        
        // Replace commas with spaces in the input string
        String output = input.replace(",", " ");
        
        // Print the modified string
        System.out.println(output);
    }
}