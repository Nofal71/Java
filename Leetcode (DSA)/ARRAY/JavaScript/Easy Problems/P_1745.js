/**
 * @param {number[]} nums
 * @return {number}
 */
var sumOfUnique = function (nums) {
    let unique = [];
    const n = nums.length;
    let TEMP = [];
    for (let i = 0; i < n; i++) {
        if (!unique.includes(TEMP)) {
            let current = nums[i];
            let count = 0
            for (let j = 0; j < n; j++) {
                if (current === nums[j]) {
                    count++
                }
            }
            if (count === 1) {
                unique.push(nums[i])
            } else {
                TEMP.push(nums[i])
            }
        }
    }
    let ans = 0;
    let sum = unique.forEach((e) => ans += e);

    return ans;
};
const nums = [1, 2, 3, 4, 5];
console.log(sumOfUnique(nums));