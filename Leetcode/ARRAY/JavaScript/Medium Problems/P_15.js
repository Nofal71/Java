const threeSum = function (nums) {
    let arr = [];
    let ans = [];
    nums.forEach(element => {
        !arr.includes(element) && arr.push(element);
    });
    let n = arr.length;
    if (n == 1) {
        let sum = arr[0] + arr[0] + arr[0];
        if (sum == 0) {
            ans.push([arr[0] , arr[0] , arr[0]]);
            return ans;
        }
    }
    
    for (let i = 0; i < n; i++) {
        let left = i + 1, right = n - 1;
        while (left < right) {
            let sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                ans.push([nums[right], nums[left], nums[i]]);
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right++;
            }
        }

    }
    return ans;
}

let nums = [0, 0, 0];
console.log(threeSum(nums));