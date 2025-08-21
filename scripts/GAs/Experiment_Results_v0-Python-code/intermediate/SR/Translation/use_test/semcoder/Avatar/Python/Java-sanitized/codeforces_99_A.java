public class codeforces_99_A {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        if ((check1 & check2) != 0) {
            if ((check1a & check2a) != 0) {
                String input = "9.1";
                String[] input_parts = input.split("\\.");
                int i = Integer.parseInt(input_parts[1]);

                if (input_parts[0].charAt(input_parts[0].length() - 1) == '9' && i < 5) {
                    System.out.println("GOTO Vasilisa.");
                } else if (input_parts[0].charAt(input_parts[0].length() - 1) != '9' && i < 5) {
                    int result = Integer.parseInt(input_parts[0]) + 1;
                    System.out.println(result);
                } else {
                    System.out.println(input_parts[0]);
                }
            }
        }
    }
}