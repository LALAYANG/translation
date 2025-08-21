public static int[] readInts() {
    return Arrays.stream(System.in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
}