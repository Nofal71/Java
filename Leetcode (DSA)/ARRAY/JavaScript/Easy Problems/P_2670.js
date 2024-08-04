/**
 * @param {number[]} nums
 * @return {number[]}
 */
var distinctDifferenceArray = function (nums) {
    
    let diff = []

    for (let i = 0; i < nums.length; i++) {
        let subArray_1 = []
        let subArray_2 = []
        let prefix = 0, suffix = 0

        for (let j = i + 1; j < nums.length; j++) {
            if (!(subArray_1.includes(nums[j]))) {
                subArray_1.push(nums[j])
            }
        }

        suffix = subArray_1.length;
        for (let j = 0; j <= i; j++) {
            if (!(subArray_2.includes(nums[j]))) {
                subArray_2.push(nums[j])
            }
        }

        prefix = subArray_2.length;
        diff.push(prefix - suffix)

    }

    return diff;
};


let nums = [1, 2, 3, 4, 5]
console.log(distinctDifferenceArray(nums));