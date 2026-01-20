public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7}; // sample input

        int maxArea = 0;
        int currArea = 0;
        int st = 0;
        int end = height.length - 1;

        while (st < end) {

            int len = Math.min(height[st], height[end]);
            int width = end - st;
            currArea = len * width;

            maxArea = Math.max(currArea, maxArea);

            if (height[st] < height[end]) {
                st++;
            } else {
                end--;
            }
        }

        System.out.println(maxArea);
    }
}
