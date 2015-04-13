import java.util.ArrayList;
import java.util.List;


public class FiboNos {

	
	public static void main(String[] args){
		//1,\;1,\;2,\;3,\;5,\;8,\;13,\;21,\;34,\;55,\;89,\;144,\;
		
		
		
		Integer value = 100;
		FiboNos fNo = new FiboNos();
		List<Integer> values = fNo.calculateFib(value);
		
		for(Integer i:values){
			System.out.println(i);
		}
		
	}
	
	public List<Integer> calculateFib(Integer maxValue) {		
		Integer firstNo = 1;
		Integer secondNo = 1;
		Integer count =1;
		List<Integer> results = new ArrayList<Integer>();
		results.add(firstNo);
		results.add(secondNo);
		
		while(count < maxValue){ //1<100
			Integer no = firstNo + secondNo; //2
			firstNo = secondNo;
			secondNo = no;
			count ++;
			if(no == 1836311903){
				System.out.println(no);
			}
			results.add(no);
		}
		
		
		return results;
	}
	
}
