package listassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]array= {1,2,3,4,5};
		//using Arrays
		//List<Integer> list = Arrays.asList(array);
		
		List<Integer> list = new ArrayList<Integer>();
		//using collections
		Collections.addAll(list,array);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
		//System.out.println(list.get(2));
		
		//using collections
		
	}

}

