// Define the decorator function
static Object my_decorator(Function<Object[], Object> func) {
    return (Object[] args) -> func.apply(args);
}

// Define the recursive loop function
static void recursiveLoop(int loopCounter, int stop, int step) {
    if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
        return;
    }
    for (int k = 1; k <= S.length; k++) {
        E = k * X + 2 * IntStream.range(0, arraySize - 2 * k).map(j -> S[j]).sum();
        ans = Math.min(ans, E);
    }
    recursiveLoop(loopCounter + step, stop, step);
}

public static void main(String[] args) {
    // Read input data
    Scanner scanner = new Scanner(System.in);
    arraySize = scanner.nextInt();
    X = scanner.nextInt();
    arrayA = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
        arrayA[i] = scanner.nextInt();
    }
    shuffle(new int[]{64, 64, 58});
    S = IntStream.of(arrayA).boxed().map(i -> i).collect(Collectors.toList());
    S = IntStream.range(0, arraySize).map(i -> S.get(i)).boxed().collect(Collectors.toList());
    ans = Integer.MAX_VALUE;
    loopBoundOne = 71;
    loopBoundTwo = 70;

    recursiveLoop(0, loopBoundOne / loopBoundTwo, 1);
    System.out.println(ans + arraySize * X + 5 * S.get(S.size() - 1));
}