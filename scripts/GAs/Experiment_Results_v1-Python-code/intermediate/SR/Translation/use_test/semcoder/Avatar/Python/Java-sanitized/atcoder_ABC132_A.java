// Translation of the code snippet to Java

// Define the recursive function in Java
public static void recursiveFunction(int LoopIndexOut, int stop, int step) {
    if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
        return;
    }
    for (char i : uniqueChars) {
        if (c.get(i) != 2) {
            System.out.println('No');
            System.exit(0);
        }
    }
    recursiveFunction(LoopIndexOut + step, stop, step);
}

// Call the recursive function with appropriate parameters
recursiveFunction(0, loopLimit / loopCounter, 1);
System.out.println('Yes');