package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		TreeSet tr = new TreeSet();
		// add info

		tr.add(100);
		tr.add(200);
		tr.add(400);
		tr.add(300);
		tr.add(600);
		tr.add(500);
		tr.add(500);

		// tr.add(null); not allow
		System.out.println(tr);
		// isempty
		System.out.println(tr.isEmpty());
		// size
		System.out.println(tr.size());
		// element is present or not
		System.out.println(tr.contains(200));

		// remove info
		tr.remove(400);
		System.out.println(tr);

		// print frist
		System.out.println(tr.first());

		// print last
		System.out.println(tr.last());

		// remove first

		tr.pollFirst();
		System.out.println(tr);

		// remove last
		tr.pollLast();
		System.out.println(tr);

		System.out.println("---using for each loop----");
		for (Object s1 : tr) {
			System.out.println(s1);
		}
		System.out.println("--using iterator cursor----");

		Iterator itr = tr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		

	}

}
