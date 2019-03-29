import java.util.ArrayList;

import java.util.*;

public class LargestUnsorted {
	public static void main(String args[]) {
	int arr [] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 	
	ArrayList <Integer> al = new ArrayList<Integer>();
	int count = 0;
	for(int i = 0; i<arr.length;i++) {
		if(arr[i]!=0) {
			al.add(arr[i]);
		}
		else
			count ++;
	}
	while(count>0) {
		al.add(0);
		count --;
	}
	
	Iterator i = al.iterator();
	while(i.hasNext()) {
	System.out.print(i.next());
		
	}
	
			}
		}