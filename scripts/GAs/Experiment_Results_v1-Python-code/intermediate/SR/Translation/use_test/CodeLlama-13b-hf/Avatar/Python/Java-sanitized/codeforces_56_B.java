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
    .on('close', function () {
        let [n, arr] = input;
        n = parseInt(n);
        arr = arr.split(' ').map(Number);
        let mn = n + 1;
        let mx = -1;
        for (let i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mn == n + 1 && mx == -1) {
            console.log('0 0');
        } else {
            let arr2 = arr.slice();
            for (let i = mn; i <= mx; i++) {
                arr2[i] = arr[mx - i];
            }
            if (arr.toString() == arr2.toString()) {
                console.log(mn + 1, mx + 1);
            } else {
                console.log('0 0');
            }
        }
    });