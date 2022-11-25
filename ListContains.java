package listassignments;

import java.util.ArrayList;
import java.util.List;

public class ListContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List  - Web Automation, API Automation, Mobile Automation.
		//Output – True
		List<String> list = new ArrayList<String>();
		
		list.add("Web Automation");
		list.add("API Automation");
		list.add("Mobile Automation");
		for(int i=0;i<list.size();i++){		
					
		if(list.get(i).contains("Mobile"))
			System.out.println("true");
		else
			System.out.println("false");

	}
	}

}
