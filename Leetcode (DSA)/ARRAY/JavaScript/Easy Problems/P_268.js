/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
    nums.sort((a, b) => a - b)
    let start = 0, end = nums.length - 1;
    while (start <= end) {
        let target_1 = nums[start] + 1;
        let target_2 = nums[end] - 1;
        if (target_1 == nums[start + 1]) start++
        else return target_1
        if (target_2 == nums[end - 1]) end--
        else return target_2
    }
    return nums[end]+1
};