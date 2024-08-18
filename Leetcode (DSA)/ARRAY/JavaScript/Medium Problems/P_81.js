/**
 * @param {number[]} nums
 * @param {number} target
 * @return {boolean}
 */

let search = (nums, target) => {
    let pvoit = findPviot(nums);
    if (pvoit == -1) {
        return binarySearch(nums, target, 0, nums.length - 1)
    }
    if (nums[pvoit] == target) return true
    if (target >= nums[0]) return binarySearch(nums, target, 0, pvoit - 1);
    else return binarySearch(nums, target, pvoit + 1, nums.length - 1)
}

let findPviot = (nums) => {
    let start = 0, end = nums.length - 1;
    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);
        if (mid < end && nums[mid] > nums[mid + 1]) {
            return mid
        } else if (mid > start && nums[mid] < nums[mid - 1]) {
            return mid - 1
        }

        if (nums[mid] == nums[start] && nums[mid] == nums[end]) {

            if (nums[start] > nums[start + 1]) {
                return start
            }
            start++;
            if (nums[end] < nums[end - 1]) {
                return end - 1
            }
            end--
        } else if (nums[mid] > nums[start] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
};

let binarySearch = (arr, target, start, end) => {
    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2)
        if (arr[mid] < target) {
            start = mid + 1
        } else if (target < arr[mid]) {
            end = mid - 1
        } else {
            return true
        }
    }
    return false
}

let nums = [2, 3, 4, 5, 6, 1], target = 2;
console.log(search(nums, target));
