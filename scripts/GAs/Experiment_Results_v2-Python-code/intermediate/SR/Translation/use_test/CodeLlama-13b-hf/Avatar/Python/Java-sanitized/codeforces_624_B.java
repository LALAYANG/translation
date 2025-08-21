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
        let [n, ...a] = input;
        a = a.map(Number);
        a.sort((a, b) => b - a);
        let pre = 2147483647;
        let ans = 0;
        for (let i = 0; i < n; i++) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        console.log(ans);
        process.exit();
    });