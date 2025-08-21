script

const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const n = Number(input[0]);
const a = input[1].split(" ").map(Number);
const total = a.reduce((a, b) => a ^ b);
console.log(a.map(ai => ai ^ total).join(" "));