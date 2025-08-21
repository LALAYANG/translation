script
const txt = process.argv[2];
let cu = 0;
let cl = 0;
let outer_loop_bound = 128;
let inner_loop_bound = 127;
for (let LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
    for (let i = 0; i < txt.length; i++) {
        if (txt[i].toLowerCase() === txt[i]) {
            let lowercase_flag = 1;
            cl = calculate_result(cl, lowercase_flag);
        } else {
            cu = cu + 1;
        }
    }
}
if (cu > cl) {
    final_output = txt.toUpperCase();
} else {
    final_output = txt.toLowerCase();
}
console.log(final_output);