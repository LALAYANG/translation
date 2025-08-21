// Define the my_decorator function
static Object my_decorator(Object func) {
    return func;
}

// Define the generate_number_sequence function
static void generate_number_sequence(int number, int four, int seven) {
    if (number > limit) {
        return;
    }
    if (number > 0 && four == seven) {
        l.add(number);
    }
    generate_number_sequence(number * 10 + 4, four + 1, seven);
    generate_number_sequence(number * 10 + 7, four, seven + 1);
}

// Define the main_function
static void main_function() {
    generate_number_sequence(0, 0, 0);
    Collections.sort(l);
    int target_number = Integer.parseInt(input());
    int ans = 0;
    int outer_loop_limit = 690;
    int inner_loop_limit = 689;

    // Define the search_loop function
    void search_loop(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int val : l) {
            if (val >= target_number) {
                ans = val;
                break;
            }
        }
        search_loop(LoopIndexOut + step, stop, step);
    }
    search_loop(0, outer_loop_limit / inner_loop_limit, 1);
    System.out.println(ans);
}

// Call the main_function to execute the program
public static void main(String[] args) {
    main_function();
}