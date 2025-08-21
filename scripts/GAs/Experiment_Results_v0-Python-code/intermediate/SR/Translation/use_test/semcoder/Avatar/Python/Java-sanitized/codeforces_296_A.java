// Define the decorator function
static Object my_decorator(Object func) {
    return func;
}

// Define the calculate_threshold function
static double calculate_threshold(int a, int b) {
    // Perform t-test
    return a / b;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> m = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    boolean is_possible = true;
    int CHECK_CONSTANT_2 = 557;
    int CHECK_CONSTANT_1 = 556;

    // Define the check_counts function
    void check_counts(int loop_index, int stop, int step) {
        if (step == 0 || (step > 0 && loop_index >= stop) || (step < 0 && loop_index <= stop)) {
            return;
        }
        for (int element : m) {
            if (Collections.frequency(m, element) >= calculate_threshold(n, 2) + 1) {
                is_possible = false;
                break;
            }
        }
        check_counts(loop_index + step, stop, step);
    }

    check_counts(0, CHECK_CONSTANT_2 / CHECK_CONSTANT_1, 1);
    System.out.println(is_possible ? "YES" : "NO");
}