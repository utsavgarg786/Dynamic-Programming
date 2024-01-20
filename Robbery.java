package DP;

public class Robbery {

	public static void main(String[] args) {
		
		int[] nums = {2,7,9,3,1};
		int ans = robbery(nums);
		System.out.println(ans);
	}

	private static int robbery(int[] nums) {

		int n = nums.length;
		if(n == 1) {
			return nums[0];
		}
		nums[1] = Math.max(nums[0], nums[1]);
		for(int i = 2 ; i < n ; i++) {
			nums[i] = Math.max(nums[i] + nums[i-2], nums[i-1]);
		}
		return nums[n-1];
	}

}
