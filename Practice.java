package DP;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		int[] arr = {900,940,950,1100,1500,1800};
		int[] dep = {910,1200,1120,1130,1900,2000};
		int ans = platforNeeded(arr,dep);
		System.out.println(ans);
		
	}

	private static int platforNeeded(int[] arr, int[] dep) {

		Arrays.sort(arr);
		Arrays.sort(dep);
		int n = arr.length;
		int i = 0;
		int j = 0;
		int platform = 0;
		int result = 0;
		while(i<n && j<n) {
			if(arr[i] <= dep[j]) {
				platform++;
				i++;
			}
			else {
				platform--;
				j++;
			}
			if(result < platform) {
				result = platform;
			}
		}
		return result;
	}


}
