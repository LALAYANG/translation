public class atcoder_ABC051_A {
    public static void main(String[] args) {
        // Read input string from the user
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputString = input.nextLine();

        // Replace commas with spaces and print the modified string
        String outputString = inputString.replace(",", " ");
        System.out.println(outputString);
    }
}