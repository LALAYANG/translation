script
const txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
const outer_loop_bound = 176;
const inner_loop_bound = 175;
let cu = 0;
let cl = 0;
for (let outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
    for (let character = 0; character < txt.length; character++) {
        if (txt[character].toLowerCase() === txt[character]) {
            const increment = 1;
            const sum_queue = [];

            const sum_thread = () => {
                const result = compute_sum(cl, increment);
                sum_queue.push(result);
            };
            sum_thread();
            cl = sum_queue.shift();
        } else {
            cu = cu + 1;
        }
    }
}
if (cu > cl) {
    out = txt.toUpperCase();
} else {
    out = txt.toLowerCase();
}
console.log(out);