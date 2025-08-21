import java.util.Base64;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        String originalInput = "Hello World!";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("Encoded string: " + encodedString);
    }
}