package DP;

public class HouseRobber2 {

	public static void main(String[] args) {

		int[] arr = {2,7,3,1,4,2,1,8};
		int ans = houseRobber2(arr);
		System.out.println(ans);
	}

	private static int houseRobber2(int[] arr) {

		int includingFirst = houseUsingFirstElement(arr);
		int includingLast = houseUsingLastElement(arr);
		
		int ans = Math.max(includingFirst, includingLast);
		
		return ans;
	}

	private static int houseUsingLastElement(int[] arr) {
		int n =arr.length;
		int[] count = new int[n-1];
		count[0] = arr[1];
		count[1] = Math.max(arr[2], arr[1]);
		for(int i = 2; i<n-1 ;i++) {
			count[i] = Math.max(arr[i+1]+ count[i-2], count[i-1]);
		}
		return count[n-2];
	}

	private static int houseUsingFirstElement(int[] arr) {

		int n =arr.length;
		int[] count = new int[n-1];
		count[0] = arr[0];
		count[1] = Math.max(arr[0], arr[1]);
		for(int i = 2 ; i< n-1; i++) {
			count[i] = Math.max(arr[i]+ count[i-2], count[i-1]);
		}
		return count[n-2];
	}

}
