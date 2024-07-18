/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isArraySpecial = function (nums) {
  if (nums.length < 2) return true;
  for (let i = 0; i < nums.length - 1; i++) {
    let next = nums[i + 1];
    let first = next % 2 == 0 ? true : false;
    let second = nums[i] % 2 == 0 ? true : false;
    if (first == second) return false;
  }

  return true;
};

let nums = [1, 5];
console.log(isArraySpecial(nums));
