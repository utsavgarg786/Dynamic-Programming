package DP;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		int ans  = minimumPathSum(arr);
		System.out.println(ans);
	}

	private static int minimumPathSum(int[][] arr) {

		int m = arr.length;
		int n = arr[0].length;
		
		for(int i = 1 , j= 0; i<m ; i++) {
			arr[i][j] = arr[i][j] + arr[i-1][j];
		}
		for(int j = 1 , i= 0; j<n ; j++) {
			arr[i][j] = arr[i][j] + arr[i][j-1];
		}
		for(int i = 1; i< m; i++) {
			for(int j = 1; j< n ; j++) {
				arr[i][j] = arr[i][j] + Math.min(arr[i][j-1], arr[i-1][j]);
			}
		}
		return arr[m-1][n-1];
	}

}
