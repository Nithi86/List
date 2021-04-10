package org.alist;

import java.util.ArrayList;
import java.util.List;

public class AList {
public static void main(String[] args) {
	 List <Integer>l=new ArrayList<>();
	//8.3 Add the value in 8th index of the List
	 l.add(10);
	 l.add(20);
	 l.add(30);
	 l.add(90);
	 l.add(10);
	 l.add(10);
	 l.add(40);
	 l.add(50);
	 System.out.println(l);
	 
	 System.out.println("Add the values 2nd index of  list "); 
	 l.add(8,80);
	 System.out.println(l);
	 
	 
	 
	 
}
}
