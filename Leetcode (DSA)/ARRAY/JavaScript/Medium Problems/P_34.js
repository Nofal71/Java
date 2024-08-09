// /**
//  * @param {number[]} nums
//  * @param {number} target
//  * @return {number[]}
//  */
// var searchRange = function (nums, target) {
//   if (!nums.includes(target)) return [-1, -1];
//   let ans = [],
//     freq = 0,
//     index = nums.indexOf(target);
//   ans.push(index);
//   for (let i = index; i < nums.length; i++) {
//     if (nums[i] != target) break;
//     freq++;
//   }
//   ans.push(index - 1 + freq);

//   return ans;
// };

// let nums = [3, 3, 3],
//   target = 3;
// console.log(searchRange(nums, target));





/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function (nums, target) {
  let start = searchRange_1(nums, target, true)
  let end = searchRange_1(nums, target, false)
  return [start, end]

};

var searchRange_1 = function (nums, target, firstIndex) {
  let ans = -1
  let start = 0, end = nums.length - 1;
  while (start <= end) {
    let mid = Math.floor(start + (end - start) / 2)
    if (nums[mid] > target) {
      end = mid - 1
    } else if (nums[mid] < target) {
      start = mid + 1
    } else {
      ans = mid
      if (firstIndex) {
        end = mid - 1
      } else {
        start = mid + 1
      }
    }
  }
  return ans
};


let nums = [5, 7, 7, 8, 8, 10], target = 8
console.log(searchRange(nums, target));
