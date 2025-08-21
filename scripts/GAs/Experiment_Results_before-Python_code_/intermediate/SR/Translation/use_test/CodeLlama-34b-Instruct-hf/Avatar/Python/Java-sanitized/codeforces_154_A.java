public class codeforces_154_A {
    @Test
    public void test() {
        String s = "mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvvjvjjjjjmmbmbbbbbmbbbbmm";
        int n = 5;
        String[] x = {"mb", "ho", "xu", "jv", "yp"};
        int expected = 37;
        int actual = Solution.solve(s, n, x);
        assertEquals(expected, actual);
    }
}