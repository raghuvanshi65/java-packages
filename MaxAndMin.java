import helpers.Helper;
import java.util.*;

/**
 * https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/ 
 */
public class MaxAndMin{

	// Time -> O(nlogn), Space -> O(logn)
	private int[] findMaxAndMin1(int[] arr){
		Arrays.sort(arr);
		return new int[]{arr[0], arr[arr.length-1]};
	}

	// Time -> O(n), Space -> O(1)
	private int[] findMaxAndMin2(int[] arr){
		int[] res = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
		for(int x: arr){
			res[0] = Math.min(x, res[0]);
			res[1] = Math.max(x, res[1]);
		}
		return res;
	}

	public static void main(String[] args) {
		Helper hlpr = new Helper();
		MaxAndMin obj = new MaxAndMin();
		int[] arr = new int[hlpr.nextInt()];

		for(int i=0; i<arr.length; i++)
			arr[i] = hlpr.nextInt();
		System.out.println(Arrays.toString(obj.findMaxAndMin2(arr)));
	}
}