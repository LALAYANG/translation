// Define the decorator function
public static Object my_decorator(Object func) {
    return func;
}

// Define the outerLoop function
@my_decorator
public static void outerLoop(int LoopIndexOut, int stop, int step) {
    if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
        return;
    }

    // Define the innerLoop function
    public static void innerLoop(int innerLoopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && innerLoopIndex >= stop) || (step < 0 && innerLoopIndex <= stop)) {
            return;
        }
        System.out.println((int) (Math.pow(commonRatio, innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio)));
        innerLoop(innerLoopIndex + step, stop, step);
    }

    // Call ttest_ind function for statistical analysis
    // ttest_ind([84, 66, 16], [16, 86, 71]);

    // Call innerLoop function
    innerLoop(2, 12, 1);

    // Recursive call to outerLoop
    outerLoop(LoopIndexOut + step, stop, step);
}

// Main function to initiate the process
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    commonRatio = scanner.nextDouble();
    D = scanner.nextInt();
    x = scanner.nextInt();
    outerLoop(0, outerLoopStart / outerLoopEnd, 1);
}