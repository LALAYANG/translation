public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    List<Integer> x = new ArrayList<>();
    List<Integer> y = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        x.add(scanner.nextInt());
        y.add(scanner.nextInt());
    }
    solve(N, x, y);
}