/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
  let right = height.length - 1,
    left = 0,
    max_Area = 0;
  while (left < right) {
    let current_area = Math.min(height[left], height[right]) * (right - left);
    if (max_Area < current_area) max_Area = current_area;
    if (height[left] < height[right]) left++;
    else right--;
  }
  return max_Area;
};

let height = [1, 8, 6, 2, 5, 4, 8, 3, 7];
console.log(maxArea(height));
