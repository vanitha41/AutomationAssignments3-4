package listassignments;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //33,44,55,66,77,88 
		List<Integer>list = new ArrayList<Integer>();
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(55);
		
		System.out.println("list is"+list);
		
		list.remove(1);
		list.remove(Integer.valueOf(55));
		list.add(3,90);
		System.out.println(list.size());
		System.out.println("list is"+list);
		Integer[] arr = list.toArray(new Integer[0]);
		for(int i=0;i<arr.length;i++)
		System.out.println("array"+arr[i]);
		
	}

}
