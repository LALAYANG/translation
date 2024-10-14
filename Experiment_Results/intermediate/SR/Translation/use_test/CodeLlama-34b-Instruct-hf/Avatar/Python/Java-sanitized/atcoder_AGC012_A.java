public static int[] readInts() {
    Scanner scanner = new Scanner(System.in);
    int[] A = new int[scanner.nextInt()];
    for (int i = 0; i < A.length; i++) {
        A[i] = scanner.nextInt();
    }
    return A;
}