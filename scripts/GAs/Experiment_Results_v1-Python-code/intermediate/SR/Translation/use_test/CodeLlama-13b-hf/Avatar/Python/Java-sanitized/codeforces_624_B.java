script
const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const n = parseInt(input[0]);
const a = input[1].split(' ').map(x => parseInt(x));
a.sort((a, b) => b - a);
let pre = Number.MAX_SAFE_INTEGER;
let result = 0;
for (let i = 0; i < n; i++) {
    result += Math.max(0, Math.min(pre - 1, a[i]));
    pre = Math.max(0, Math.min(pre - 1, a[i]));
}
console.log(result);