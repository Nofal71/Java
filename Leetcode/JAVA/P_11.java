public class P_11 {
    public static int maxArea(int[] height) {
        int maxWater = 0;

        int right = height.length - 1;
        int left = 0;

        while (left < right) {

            int minHeight = 0;

            if (height[left] < height[right]) {
                minHeight = height[left];
            } else {
                minHeight = height[right];
            }

            int area = minHeight * (right - left);

            if (area > maxWater) {
                maxWater = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
