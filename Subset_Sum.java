package DP;

public class Subset_Sum {
	
	static boolean ans[] = new boolean[6];
	public static void main(String[] args)
	{
		int sum = 26;
		int[] arr = {3, 34, 4, 12, 5, 2};
		int n = arr.length;
		boolean result= fun(arr,  n,  sum);
		System.out.println(result);
	}

	private static boolean fun(int[] arr, int n, int sum) {
		if(sum == 0)
		{
			ans[n] = true;
			return ans[n];
		}
		if(n == 0)
		{
			ans[n] = false;
			return ans[n];
		}
		
		ans[n-1] =(fun(arr, n-1, sum - arr[n-1]) || fun(arr, n-1, sum));
		return ans[n-1];		
	}
	
	

}
