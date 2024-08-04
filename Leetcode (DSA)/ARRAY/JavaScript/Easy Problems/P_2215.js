var findDifference = function (nums1, nums2) {
    let ans = [[], []];

    for (let i = 0; i < nums1.length; i++) {
        let isPresent = false;
        for (let j = 0; j < nums2.length; j++) {
            if (nums1[i] === nums2[j]) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            if (!ans[0].includes(nums1[i])) {
                ans[0].push(nums1[i]);
            }
        }
    }

    for (let i = 0; i < nums2.length; i++) {
        let isPresent = false;
        for (let j = 0; j < nums1.length; j++) {
            if (nums2[i] === nums1[j]) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            if (!ans[1].includes(nums2[i])) {
                ans[1].push(nums2[i]);
            }
        }
    }

    return ans;
}





let nums1 = [1, 2, 3];
let nums2 = [4, 2, 5];
console.log(findDifference(nums1, nums2));