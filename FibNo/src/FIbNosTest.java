import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class FIbNosTest {

	private boolean b;
	private Integer ii;
	
	
	@Test
	public void test() {
		Integer ii = null;
		System.out.print(ii);
		
		int s;
		
		
		//System.out.print(s);
		System.out.print(b);
		
		FiboNos fibSeries = new FiboNos();
		
		List<Integer> fib = fibSeries.calculateFib(9);//100
		
		List<Integer> fibTest = new ArrayList<Integer>();
		fibTest.add(1);
		fibTest.add(1);
		fibTest.add(2);
		fibTest.add(3);
		fibTest.add(5);
		fibTest.add(8);
		fibTest.add(13);
		fibTest.add(21);
		fibTest.add(34);
		fibTest.add(55);
		
		if(fib.size() != fibTest.size()){
			fail("The result size does not match");
		}
		
		for(int i=0; i<fibTest.size(); i++){
			if(fibTest.get(i) != fib.get(i)){
				fail("The Value does not match");
			}
		}
		
	
	}

	
	
}
