package main.java;

public class NaturalNoCalculator {
	
	public static void main(String[] args) throws Exception {
		int sum =0;
		for (int i=0 ;i< 1000; i++) {
			if (i % 3 == 0) {
				//System.out.print(i);	
				sum = sum + i;
			} else if (i % 5 ==0) {
				//System.out.print(i);	
				sum = sum + i;
			}
		}
		System.out.print("Values : " + sum);				
	}
}
