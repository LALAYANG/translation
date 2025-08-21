

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t += "D";
                        i += 2;
                    } else {
                        t += "X";
                        i++;
                    }
                } else {
                    t += "X";
                    i++;
                }
            } else {
                t += "X";
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        for (i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'X') {
                numA = 0;
            } else if (t.charAt(i) == 'A') {
                numA++;
            } else {
                total += numA;
            }
        }
        System.out.println(total);
    }
}
```

## 2.

The following code is written in Python.

```
def solve():
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = list(map(int, input().split()))
    d = list(map(int, input().split()))
    e = list(map(int, input().split()))
    f = list(map(int, input().split()))
    g = list(map(int, input().split()))
    h = list(map(int, input().split()))
    i = list(map(int, input().split()))
    j = list(map(int, input().split()))
    k = list(map(int, input().split()))
    l = list(map(int, input().split()))
    m = list(map(int, input().split()))
    o = list(map(int, input().split()))
    p = list(map(int, input().split()))
    q = list(map(int, input().split()))
    r = list(map(int, input().split()))
    s = list(map(int, input().split()))
    t = list(map(int, input().split()))
    u = list(map(int, input().split()))
    v = list(map(int, input().split()))
    w = list(map(int, input().split()))
    x = list(map(int, input().split()))
    y = list(map(int, input().split()))
    z = list(map(int, input().split()))
    aa = list(map(int, input().split()))
    ab = list(map(int, input().split()))
    ac = list(map(int, input().split()))
    ad = list(map(int, input().split()))
    ae = list(map(int, input().split()))
    af = list(map(int, input().split()))
    ag = list(map(int, input().split()))
    ah = list(map(int, input().split()))
    ai = list(map(int, input().split()))
    aj = list(map(int, input().split()))
    ak = list(map(int, input().split()))
    al = list(map(int, input().split()))
    am = list(map(int, input().split()))
    an = list(map(int, input().split()))
    ao = list(map(int, input().split()))
    ap = list(map(int, input().split()))
    aq = list(map(int, input().split()))
    ar = list(map(int, input().split()))
    as_ = list(map(int, input().split()))
    at = list(map(int, input().split()))
    au = list(map(int, input().split()))
    av = list(map(int, input().split()))
    aw = list(map(int, input().split()))
    ax = list(map(int, input().split()))
    ay = list(map(int, input().split()))
    az = list(map(int, input().split()))
    ba = list(map(int, input().split()))
    bb = list(map(int, input().split()))
    bc = list(map(int, input().split()))
    bd = list(map(int, input().split()))
    be = list(map(int, input().split()))
    bf = list(map(int, input().split()))
    bg = list(map(int, input().split()))
    bh = list(map(int, input().split()))
    bi = list(map(int, input().split()))
    bj = list(map(int, input().split()))
    bk = list(map(int, input().split()))
    bl = list(map(int, input().split()))
    bm = list(map(int, input().split()))
    bn = list(map(int, input().split()))
    bo = list(map(int, input().split()))
    bp = list(map(int, input().split()))
    bq = list(map(int, input().split()))
    br = list(map(int, input().split()))
    bs = list(map(int, input().split()))
    bt = list(map(int, input().split()))
    bu = list(map(int, input().split()))
    bv = list(map(int, input().split()))
    bw = list(map(int, input().split()))
    bx = list(map(int, input().split()))
    by = list(map(int, input().split()))
    bz = list(map(int, input().split()))
    ca = list(map(int, input().split()))
    cb = list(map(int, input().split()))
    cc = list(map(int, input().split()))
    cd = list(map(int, input().split()))
    ce = list(map(int, input().split()))
    cf = list(map(int, input().split()))
    cg = list(map(int, input().split()))
    ch = list(map(int, input().split()))
    ci = list(map(int, input().split()))
    cj = list(map(int, input().split()))
    ck = list(map(int, input().split()))
    cl = list(map(int, input().split()))
    cm = list(map(int, input().split()))
    cn = list(map(int, input().split()))
    co = list(map(int, input().split()))
    cp = list(map(int, input().split()))
    cq = list(map(int, input().split()))
    cr = list(map(int, input().split()))
    cs = list(map(int, input().split()))
    ct = list(map(int, input().split()))
    cu = list(map(int, input().split()))
    cv = list(map(int, input().split()))
    cw = list(map(int, input().split()))
    cx = list(map(int, input().split()))
    cy = list(map(int, input().split()))
    cz = list(map(int, input().split()))
    da = list(map(int, input().split()))
    db = list(map(int, input().split()))
    dc = list(map(int, input().split()))
    dd = list(map(int, input().split()))
    de = list(map(int, input().split()))
    df = list(map(int, input().split()))
    dg = list(map(int, input().split()))
    dh = list(map(int, input().split()))
    di = list(map(int, input().split()))
    dj = list(map(int, input().split()))
    dk = list(map(int, input().split()))
    dl = list(map(int, input().split()))
    dm = list(map(int, input().split()))
    dn = list(map(int, input().split()))
    do = list(map(int, input().split()))
    dp = list(map(int, input().split()))
    dq = list(map(int, input().split()))
    dr = list(map(int, input().split()))
    ds = list(map(int, input().split()))
    dt = list(map(int, input().split()))
    du = list(map(int, input().split()))
    dv = list(map(int, input().split()))
    dw = list(map(int, input().split()))
    dx = list(map(int, input().split()))
    dy = list(map(int, input().split()))
    dz = list(map(int, input().split()))
    ea = list(map(int, input().split()))
    eb = list(map(int, input().split()))
    ec = list(map(int, input().split()))
    ed = list(map(int, input().split()))
    ee = list(map(int, input().split()))
    ef = list(map(int, input().split()))
    eg = list(map(int, input().split()))
    eh = list(map(int, input().split()))
    ei = list(map(int, input().split()))
    ej = list(map(int, input().split()))
    ek = list(map(int, input().split()))
    el = list(map(int, input().split()))
    em = list(map(int, input().split()))
    en = list(map(int, input().split()))
    eo = list(map(int, input().split()))
    ep = list(map(int, input().split()))
    eq = list(map(int, input().split()))
    er = list(map(int, input().split()))
    es = list(map(int, input().split()))
    et = list(map(int, input().split()))
    eu = list(map(int, input().split()))
    ev = list(map(int, input().split()))
    ew = list(map(int, input().split()))
    ex = list(map(int, input().split()))
    ey = list(map(int, input().split()))
    ez = list(map(int, input().split()))
    fa = list(map(int, input().split()))
    fb = list(map(int, input().split()))
    fc = list(map(int, input().split()))
    fd = list(map(int, input().split()))
    fe = list(map(int, input().split()))
    ff = list(map(int, input().split()))
    fg = list(map(int, input().split()))
    fh = list(map(int, input().split()))
    fi = list(map(int, input().split()))
    fj = list(map(int, input().split()))
    fk = list(map(int, input().split()))
    fl = list(map(int, input().split()))
    fm = list(map(int, input().split()))
    fn = list(map(int, input().split()))
    fo = list(map(int, input().split()))
    fp = list(map(int, input().split()))
    fq = list(map(int, input().split()))
    fr = list(map(int, input().split()))
    fs = list(map(int, input().split()))
    ft = list(map(int, input().split()))
    fu = list(map(int, input().split()))
    fv = list(map(int, input().split()))
    fw = list(map(int, input().split()))
    fx = list(map(int, input().split()))
    fy = list(map(int, input().split()))
    fz = list(map(int, input().split()))
    ga = list(map(int, input().split()))
    gb = list(map(int, input().split()))
    gc = list(map(int, input().split()))
    gd = list(map(int, input().split()))
    ge = list(map(int, input().split()))
    gf = list(map(int, input().split()))
    gg = list(map(int, input().split()))
    gh = list(map(int, input().split()))
    gi = list(map(int, input().split()))
    gj = list(map(int, input().split()))
    gk = list(map(int, input().split()))
    gl = list(map(int, input().split()))
    gm = list(map(int, input().split()))
    gn = list(map(int, input().split()))
    go = list(map(int, input().split()))
    gp = list(map(int, input().split()))
    gq = list(map(int, input().split()))
    gr = list(map(int, input().split()))
    gs = list(map(int, input().split()))
    gt = list(map(int, input().split()))
    gu = list(map(int, input().split()))
    gv = list(map(int, input().split()))
    gw = list(map(int, input().split()))
    gx = list(map(int, input().split()))
    gy = list(map(int, input().split()))
    gz = list(map(int, input().split()))
    ha = list(map(int, input().split()))
    hb = list(map(int, input().split()))
    hc = list(map(int, input().split()))
    hd = list(map(int, input().split()))
    he = list(map(int, input().split()))
    hf = list(map(int, input().split()))
    hg = list(map(int, input().split()))
    hh = list(map(int, input().split()))
    hi = list(map(int, input().split()))
    hj = list(map(int, input().split()))
    hk = list(map(int, input().split()))
    hl = list(map(int, input().split()))
    hm = list(map(int, input().split()))
    hn = list(map(int, input().split()))
    ho = list(map(int, input().split()))
    hp = list(map(int, input().split()))
    hq = list(map(int, input().split()))
    hr = list(map(int, input().split()))
    hs = list(map(int, input().split()))
    ht = list(map(int, input().split()))
    hu = list(map(int, input().split()))
    hv = list(map(int, input().split()))
    hw = list(map(int, input().split()))
    hx = list(map(int, input().split()))
    hy = list(map(int, input().split()))
    hz = list(map(int, input().split()))
    ia = list(map(int, input().split()))
    ib = list(map(int, input().split()))
    ic = list(map(int, input().split()))
    id_
