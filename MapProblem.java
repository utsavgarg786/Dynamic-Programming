package DP;

import java.util.HashMap;
import java.util.Map;

public class MapProblem {

	public static void main(String[] args) {

		int[] arr = {2,2,3,3,2,4,4,4,4,4};
		iterate(arr);
	}

	private static void iterate(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();
		for(int a: arr) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}
			else {
				map.put(a, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer,Integer> m : map.entrySet()) {
			System.out.println(m.getValue());
		}
		
	}

}
