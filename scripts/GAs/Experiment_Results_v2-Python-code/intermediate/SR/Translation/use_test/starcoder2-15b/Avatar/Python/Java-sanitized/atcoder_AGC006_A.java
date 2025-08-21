public static int sumOfSquares(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number * number;
    }
    return sum;
}