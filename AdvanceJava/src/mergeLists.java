import java.util.*;
public class mergeLists {
	public static void main(String args[]) {
		ArrayList <Integer> al1 = new ArrayList<Integer>();
		ArrayList <Integer> al2 = new ArrayList<Integer>();
		al1.add(4);
		al1.add(5);
		al1.add(1);
		al1.add(2);
		al1.add(0);
		al1.add(6);
		al1.add(7);
		al2.add(12);
		al2.add(3);
		al2.add(16);

		Iterator i = al2.iterator();
		
		while(i.hasNext()) {
			al1.add((Integer) i.next());
		}
		
		Collections.sort(al1);
		Iterator j = al1.iterator();
		
		while(j.hasNext()) {
			System.out.print(", "+j.next());
		}
}
}
