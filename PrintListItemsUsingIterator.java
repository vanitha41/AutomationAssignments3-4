package listassignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintListItemsUsingIterator {

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
		Iterator<Integer>itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
