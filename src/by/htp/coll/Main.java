package by.htp.coll;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		for(Iterator<String> li = list.iterator(); li.hasNext();) {
			
			String str = li.next();
			System.out.println(str);
			
			if(str.equals("5")) {
				list.add("33");//добавит поле 3, но перед 4
				//li.remove();
			}
			System.out.println(str);
		}
		
	
		
		/* List<String> l = new LinkedList<>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		
		for(ListIterator<String> li = l.listIterator(); li.hasNext();) {
			
			String str = li.next();
			if(str.equals("3")) {
				li.add("33");//добавит поле 3, но перед 4
				//li.remove();
				System.out.println("");
			}
		}*/

	}

}
