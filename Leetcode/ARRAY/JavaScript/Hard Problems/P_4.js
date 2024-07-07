/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
    nums2.forEach(e => {
        nums1.push(e)
    })
    nums1.sort((a, b) => a - b)

    let middle = Math.floor(nums1.length / 2)
    if (nums1.length % 2 == 0) return (nums1[middle] + nums1[middle - 1]) / 2
    return nums1[middle];
};

let nums1 = [1, 2], nums2 = [3, 4]
console.log(findMedianSortedArrays(nums1, nums2));