// Define the decorator function
static Object my_decorator(Object func) {
    return func;
}

// Define the recursive loop function
static void recursiveLoop(int loopCounter, int stop, int step) {
    // Perform t-test (sample data)
    ttest_ind(new double[]{10, 98, 46}, new double[]{95, 11, 1});

    if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
        return;
    }

    for (char i : Sa) {
        if (c.get(i) != 2) {
            System.out.println('No');
            System.exit(0);
        }
    }

    recursiveLoop(loopCounter + step, stop, step);
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    scanner.close();

    Counter c = Counter.from(S.toCharArray());
    Set<Character> Sa = new HashSet<>(c.keySet());

    if (Sa.size() != 2) {
        System.out.println('No');
        System.exit(0);
    }

    recursiveLoop(0, 810 / 809, 1);
    System.out.println('Yes');
}