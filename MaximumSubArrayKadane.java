package DP;

public class MaximumSubArrayKadane {

	public static void main(String[] args) {

		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int ans = maximSubArray(arr);
		System.out.println(ans);
	}

	private static int maximSubArray(int[] arr) {

		int sum = 0;
		int maxSum = 0;
		int n = arr.length;
		for(int i = 0; i< n ; i++) {
			sum = sum + arr[i];
			if(sum > maxSum) {
				maxSum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}

}
