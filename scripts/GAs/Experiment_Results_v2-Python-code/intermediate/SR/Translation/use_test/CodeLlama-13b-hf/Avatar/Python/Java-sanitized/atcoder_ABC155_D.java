script
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
let input = [];
rl.on('line', function (line) {
    input.push(line);
})
    .on('close', async function () {
        let [N, K] = input[0].split(' ').map(e => parseInt(e));
        let A = input[1].split(' ').map(e => parseInt(e));
        A.sort((a, b) => a - b);
        let ll = -1000000000;
        let rr = 1000000000;
        while (ll + 1 < rr) {
            let x = Math.floor((ll + rr) / 2);
            let tot = 0;
            for (let i = 0; i < N; i++) {
                if (A[i] < 0) {
                    let l = -1;
                    let r = N;
                    while (l + 1 < r) {
                        let c = Math.floor((l + r) / 2);
                        if (A[i] * A[c] < x) {
                            r = c;
                        } else {
                            l = c;
                        }
                    }
                    tot += N - r;
                } else {
                    let l = -1;
                    let r = N;
                    while (l + 1 < r) {
                        let c = Math.floor((l + r) / 2);
                        if (A[i] * A[c] < x) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    tot = tot + r;
                }
                if (A[i] * A[i] < x) {
                    tot -= 1;
                }
            }
            tot /= 2;
            if (tot < K) {
                ll = x;
            } else {
                rr = x;
            }
        }
        console.log(ll);
    });