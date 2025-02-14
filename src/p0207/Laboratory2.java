package p0207;

import java.util.ArrayList;
import java.util.Collections;

public class Laboratory2 {
	
	static void swap(int x, int y) {
		int tmp = x;
		x = y;
		y = tmp;
	}
	
	static void swap(int[] x, int i, int j) {
		int tmp = x[i];
		x[i] = x[j];
		x[j] = tmp;
	}
	
//	static void swap(ArrayList<Integer> x, int i, int j) {
//		int tmp = x.get(i);
//		x.get(i) = x.get(j);
//		x.get(j) = tmep;
//	}

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<4; i++) {
			list.add(i);
		}
		int[] nums = new int[] {0,1,2,3};
		int n1 = 0;
		int n2 = 1;
		
		System.out.println("초기값!");
		System.out.println(list);
		for(int i = 0; i <nums.length; i++) {
			System.out.print(nums[i] + " ");
			if(i == nums.length-1) {
				System.out.println("");
			}
		} 
		System.out.println(n1 + ", " + n2);
		
		swap(nums, 0, 1);
		swap(0,1);
		Collections.swap(list, 0, 1);
		
		System.out.println("스왑후!");
		System.out.println(list);
		for(int i = 0; i <nums.length; i++) {
			System.out.print(nums[i] + " ");
			if(i == nums.length-1) {
				System.out.println("");
			}
		}
		System.out.println(n1 + ", " + n2);
		
	}
}
