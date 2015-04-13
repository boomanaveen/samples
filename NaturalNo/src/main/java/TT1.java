package main.java;

import java.util.ArrayList;
import java.util.List;


public class TT1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		StringBuffer buf = new StringBuffer();
//		buf.append(String.format("%02d", 9));
//		buf.append(String.format("%02d", 1));
//		System.out.println(buf);
		TT1 f = new TT1();
		List<Integer> fabs = f.fab(5);
		for(Integer num : fabs) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

	public List<Integer> fab(Integer bound) {
		List<Integer> result = new ArrayList<Integer>();
		Integer first = 1, second = 1;
		Integer count = 2;
		result.add(first);
		result.add(second);
		while(count < bound) {
			Integer num = first + second;
			first = second;
			second = num;
			count++;
			result.add(num);
		}
		
		return result;
	}
}
