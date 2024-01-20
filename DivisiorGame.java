package DP;

public class DivisiorGame {

	public static void main(String[] args) {

		int n = 3;
		boolean ans = divisiorGame(n);
		System.out.println(ans);
	}

	private static boolean divisiorGame(int n) {

		int count = 0;
		while (n > 1) {
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					count++;
					n = n - i;
					break;
				}
			}
		}
		if (count % 2 == 0) {
			return false;
		}
		return true;
	}

}
