/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function (nums, target) {
  if (!nums.includes(target)) return [-1, -1];
  let ans = [],
    freq = 0,
    index = nums.indexOf(target);
  ans.push(index);
  for (let i = index; i < nums.length; i++) {
    if (nums[i] != target) break;
    freq++;
  }
  ans.push(index - 1 + freq);

  return ans;
};

let nums = [3, 3, 3],
  target = 3;
console.log(searchRange(nums, target));
