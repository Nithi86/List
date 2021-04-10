package org.alist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ALinkedlist {
public static void main(String[] args) {
	//4.1 to find the length of the Array list	
List<Integer> li=new ArrayList<>();
li.add(10);
li.add(20);
li.add(30);
li.add(90);
li.add(10);
li.add(10);
li.add(40);
li.add(50);
System.out.println("4.1 Length of Array List");
int a = li.size();
System.out.println("The Size of the List is: "+a);

//4.2 to find the length of the linked list

//4.4 to find the size of the linked list
//length and size are same 
	
	List<Integer> l= new LinkedList<>();
	l.add(100);
	l.add(200);
    l.add(300);
	l.add(400);
	l.add(500);
	l.add(600);
	l.add(700);
	System.out.println("4.1, 4.4  Length of Linked List");	
	System.out.println(l);
	int i = l.size();
	System.out.println("The Size of the List is: "+i);
	
	//4.3 to find the size of the vector list
	
	List<Integer> vl= new Vector<>();
	vl.add(105);
	vl.add(205);
	vl.add(305);
	vl.add(405);
	vl.add(505);
	vl.add(605);
	vl.add(705);
	vl.add(805);
	System.out.println("4.3 Length of Vector List");
	int b =vl.size();
	System.out.println("The Size of the List is: "+b);
	


} 
}
