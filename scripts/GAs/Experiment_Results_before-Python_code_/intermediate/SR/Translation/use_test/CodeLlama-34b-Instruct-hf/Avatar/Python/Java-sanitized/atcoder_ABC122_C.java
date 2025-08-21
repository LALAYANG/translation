if (s.indexOf("AC", i - 1) == i - 1) {
    cumsum[i] = cumsum[i - 1] + 1;
} else {
    cumsum[i] = cumsum[i - 1];
}