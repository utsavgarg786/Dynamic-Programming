package DP;

public class TappingWaterProblem {

	public static void main(String[] args) {

		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		int ans = tappingWater(arr);
		System.out.println(ans);
	}

	private static int tappingWater(int[] arr) {

		int n = arr.length;
		int sum = 0;
		int maxSum = 0;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = arr[0];
		for(int i = 1; i<n ; i++) {
			left[i] = Math.max(arr[i], left[i-1]);
		}
		right[n-1] = arr[n-1];
		for(int i = n-2; i>= 0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		for(int i = 0; i< n ; i++) {
			sum = (Math.min(left[i], right[i])) - arr[i];
			maxSum = maxSum + sum;
		}
		return maxSum;
	}

}
