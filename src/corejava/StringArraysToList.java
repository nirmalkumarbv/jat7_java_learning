package corejava;

import java.util.Arrays;
import java.util.*;

public class StringArraysToList {

	public static void main(String[] args) {
		
		
		String arr[]= {"Dog", "cat", "tiger"};
		
		ArrayList al= new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
		
		Iterator itr= al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
