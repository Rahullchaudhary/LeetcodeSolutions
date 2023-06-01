public class MinimizeMaximumofArray {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans, (int)((sum + i) / (i + 1)));
        }
        return ans;
    }
}
