/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target) {
    if (!nums.includes(target)) return - 1
    let middle = Math.floor((nums.length - 1) / 2)
    if (target < middle) {
        for (let i = 0; i <= middle; i++) {
            if (nums[i] === target) return i
        }
    } else if (target > middle) {
        for (let i = middle; i < nums.length; i++) {
            if (nums[i] === target) return i
        }
    } 
    return middle
};

let nums = [-1, 0, 3, 5, 9, 12], target = 9
console.log(search(nums, target));