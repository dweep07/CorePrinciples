import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[] = {4, 5 , 5, 5, 4, 6, 6, 1};
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap <Integer,Integer> count= new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!(al.contains(a[i]))) {
				al.add(a[i]);
				k++;
			
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					k++;
				}
			}
			count.put(a[i], k);
			}
		}
		
	Set sn = count.entrySet();
	Iterator it = sn.iterator();
	System.out.println("Here are the number and thier frequency");
	while(it.hasNext()) {
		Map.Entry mp = (Map.Entry)it.next();
		System.out.print("Number in the array: "+mp.getKey());
		System.out.print(" and thier Frequency: "+mp.getValue());
		System.out.println();
	}
}
}
