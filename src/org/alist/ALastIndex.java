package org.alist;

import java.util.ArrayList;
import java.util.List;

public class ALastIndex {
public static void main(String[] args) {
	List<Integer>l=new ArrayList<>();
	//5.2 Last IndexOf Value
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	System.out.println("5.2  Find Last IndexOf Value");
	System.out.println(l);
	int i = l.lastIndexOf(10);
	System.out.println(i);
	
	//5.3 Find Index Value
	System.out.println("5.3 Find IndexOf Value");
	int j = l.indexOf(50);
	System.out.println(j);
	
	
	
	//5.4 Find Index Value
	System.out.println("5.3 Find IndexOf Value");
	int k = l.indexOf(90);
	System.out.println(k);
	
}
}
