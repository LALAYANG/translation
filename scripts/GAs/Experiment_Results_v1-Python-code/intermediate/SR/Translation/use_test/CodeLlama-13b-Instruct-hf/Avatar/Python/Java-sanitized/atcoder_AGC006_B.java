public static void main(String[] args) {
    // Parse the command-line arguments
    int N = Integer.parseInt(args[0]);
    int X = Integer.parseInt(args[1]);

    // Create an array of integers
    int[] arr = new int[N];

    // Fill the array with random integers
    for (int i = 0; i < N; i++) {
        arr[i] = ThreadLocalRandom.current().nextInt(1, N * 2);
    }

    // Calculate the median of the array
    int median = calculateMedian(arr);

    // Print the result
    System.out.println("Median: " + median);
}