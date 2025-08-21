public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int condition_one = 319;
        int condition_six = 353;
        int condition_two = 400;
        int condition_five = 725;
        int condition_three = 204;
        int condition_four = 645;
        
        // Sample user input
        int user_input = 2;
        
        String[] preset_values = {"10", "100", "1000", "10000", "100000"};
        
        int new_value = 0;
        while (user_input != 0) {
            new_value += user_input % 10;
            user_input /= 10;
        }
        
        if (condition_one == 319 && condition_six == 353 && condition_two == 400 && condition_five == 725 && condition_three == 204 && condition_four == 645) {
            if (user_input < 5) {
                System.out.println(new_value);
            } else {
                System.out.println("Input value is not in preset values");
            }
        }
    }
}