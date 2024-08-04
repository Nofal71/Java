/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function (nums) {
    let count = 0

    nums.forEach(e => {
        let length = 0;
        while (e > 0) {
            e = Math.floor(e / 10);
            length++;
        }
        if (length % 2 == 0) {
            count++
        }
    })

    return count
};

const nums = [12, 345, 2, 6, 7896];
console.log(findNumbers(nums));