package DP;

public class ClimbingStairs {

	public static void main(String[] args) {

		int n = 2;
		int ans = distinctWaysToClimb(n);
		System.out.println(ans);
	}

	private static int distinctWaysToClimb(int n) {

		int[] arr = new int[n+1];
		
		if(n <= 2) {
			return n;
		}
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3 ; i<=n ;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}

}
