package DP;

import java.util.Arrays;

public class PlatformProblem {

	public static void main(String[] args) {
		
		int[] arr = {900,940,950,1100,1500,1800};
		int[] dep = {910,1200,1120,1130,1900,2000};
		int ans = minPlatform(arr, dep);
		System.out.println(ans);
	}

	private static int minPlatform(int[] arr, int[] dep) {

		Arrays.sort(arr);
		Arrays.sort(dep);
		int n = arr.length;
		int i = 0;
		int j = 0;
		int platformNeeded = 0;
		int ans = 0;
		while(i<n && j<n) {
			if(arr[i] <= dep[j]) {
				platformNeeded++;
				i++;
			}
			else {
				platformNeeded--;
				j++;
			}
			if(platformNeeded > ans) {
				ans = platformNeeded;
			}
		}
		return ans;
	}
}
