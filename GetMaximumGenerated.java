package DP;

public class GetMaximumGenerated {

	public static void main(String[] args) {

		int n = 7;
		int ans = getMaximumGenrated(n);
		System.out.println(ans);
	}

	private static int getMaximumGenrated(int n) {

		int[] nums = new int[n+1];
		for(int i = 0; i<= n; i++) {
			nums[i] = -1;
		}
		nums[0] = 0;
		nums[1] = 1;
		for(int i =1; i<=n/3 ; i++) {
			nums[2*i] = nums[i];
			nums[(2*i)+1] = nums[i] + nums[i+1];
		}
		int max = nums[0];
		for(int i = 0; i<=n; i++) {
			if(nums[i]> max) {
				max = nums[i];
			}
		}
		return max;
	}

}
