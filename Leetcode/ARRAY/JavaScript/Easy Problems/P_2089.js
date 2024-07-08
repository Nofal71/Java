/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var targetIndices = function (nums, target) {

    // for (let i = 0; i < nums.length; i++) {
    //     for (let j = 0; j < nums.length; j++) {
    //         if (nums[i] < nums[j]) {
    //             let temp = nums[j];
    //             nums[j] = nums[i];
    //             nums[i] = temp;
    //         }
    //     }
    // }

    nums.sort((a, b) => a - b);
    let ans = []
    nums.forEach((element, index) => {
        if (target == element)  ans.push(index)
    })

    return ans
};

let nums = [1, 2, 5, 2, 3], target = 2;
console.log(targetIndices(nums, target));