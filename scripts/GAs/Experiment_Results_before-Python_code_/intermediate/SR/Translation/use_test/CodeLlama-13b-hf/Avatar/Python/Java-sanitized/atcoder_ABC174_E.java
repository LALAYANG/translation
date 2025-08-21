script

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const n = parseInt(readline(), 10);
    const k = parseInt(readline(), 10);
    const lis = readline().split(' ').map(Number);
    let a = 1;
    let b = Math.max(...lis);
    let ans = b;
    while (a <= b) {
        const mid = Math.floor((a + b) / 2);
        if (check(lis, k, mid)) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    console.log(ans);
}

function check(lis, k, mid) {
    for (const i of lis) {
        if (i % mid === 0) {
            k++;
        }
        k -= Math.floor(i / mid);
    }
    return k >= 0;
}