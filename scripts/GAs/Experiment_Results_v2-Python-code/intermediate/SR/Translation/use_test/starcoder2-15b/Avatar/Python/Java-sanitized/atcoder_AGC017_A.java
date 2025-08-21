public static double standardDeviationList(int[] lis) {
    double sum = 0;
    for (int i = 0; i < lis.length; i++) {
        sum += lis[i];
    }
    double average = sum / lis.length;
    sum = 0;
    for (int i = 0; i < lis.length; i++) {
        sum += Math.pow(lis[i] - average, 2);
    }
    return Math.sqrt(sum / lis.length);
}