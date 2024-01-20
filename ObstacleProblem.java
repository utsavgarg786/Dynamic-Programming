package DP;

public class ObstacleProblem {

	public static void main(String[] args) {

		int[][] arr = {{0,0,0},{0,1,0},{0,0,0}};
		int ans = obstacleProb(arr);
		System.out.println(ans);
	}

	private static int obstacleProb(int[][] arr) {

		int m = arr.length;
		int n = arr[0].length;
		
		for(int i = 0; i< m ; i++) {
			if(arr[i][0] == 0) {
				arr[i][0] = 1;
			}
			else {
				arr[i][0] = 0;
				break;
			}
		}
		for(int j = 1; j< n ; j++) {
			if(arr[0][j] == 0) {
				arr[0][j] = 1;
			}
			else {
				arr[0][j] = 0;
				break;
			}
		}
		
		for(int i = 1; i< m ; i++) {
			for(int j = 1 ; j < n; j++) {
				if(arr[i][j] == 1) {
					arr[i][j] = 0;
				}
				else {
					arr[i][j] = arr[i][j-1]+ arr[i-1][j];
				}
			}
		}
		
		return arr[m-1][n-1];
	}

}
