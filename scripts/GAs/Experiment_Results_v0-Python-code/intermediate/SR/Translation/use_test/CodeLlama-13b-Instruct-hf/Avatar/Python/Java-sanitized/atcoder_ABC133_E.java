public static int dfs(int fro, int to, int f) {
    int caseNum = f;
    int remainingColors = K - 1;
    if (f == K) {
        remainingColors = K - 2;
    }
    for (int u : graph[fro]) {
        if (u == to) {
            continue;
        }
        int result = dfs(u, fro, remainingColors);
        if (result == 0) {
            caseNum = 0;
            break;
        }
        caseNum = (caseNum * result) % mod;
        remainingColors--;
    }
    return caseNum;
}