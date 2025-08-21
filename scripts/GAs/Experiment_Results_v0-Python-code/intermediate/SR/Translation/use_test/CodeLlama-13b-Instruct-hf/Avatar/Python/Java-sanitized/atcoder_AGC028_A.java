public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int M = Integer.parseInt(args[1]);
    String S = args[2];
    String T = args[3];
    List<Integer> listS = new ArrayList<>();
    List<Integer> listT = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        listS.add(i);
    }
    for (int j = 0; j < M; j++) {
        listT.add(j);
    }
    List<Integer> indicesN = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        indicesN.add(i);
    }
    List<Integer> numberIMN = new ArrayList<>();
    for (int i : indicesN) {
        numberIMN.add(i * M / N);
    }
    List<Integer> numberJ = new ArrayList<>();
    for (int j = 0; j < M; j++) {
        numberJ.add(j);
    }
    List<Integer> kaburiJ = new ArrayList<>();
    for (int j : numberJ) {
        if (numberIMN.contains(j)) {
            kaburiJ.add(j);
        }
    }
    List<Integer> kaburiI = new ArrayList<>();
    for (int j : kaburiJ) {
        kaburiI.add(j * N / M);
    }
    int counter = 0;
    int flag = 0;
    int kaburiSize = kaburiI.size();
    while (counter <= kaburiSize - 1) {
        if (listS.get(kaburiI.get(counter)) == listT.get(kaburiJ.get(counter))) {
            pass
        } else {
            flag = 1;
            break;
        }
        int variable332 = 1;
        int incrementedCounter = incrementCounter(variable332, counter);
        counter = incrementedCounter;
    }
    if (flag == 1) {
        System.out.println(-1);
    } else {
        System.out.println(int(N * M / funcGcd0(N, M)));
    }
}