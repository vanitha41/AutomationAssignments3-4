package listassignments;

import java.util.ArrayList;
import java.util.List;

public class PrintListItemsUsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		for(int i:list) {
			System.out.println(i);
		}
	}

}
