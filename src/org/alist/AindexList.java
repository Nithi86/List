package org.alist;

import java.util.ArrayList;
import java.util.List;

public class AindexList {
public static void main(String[] args) {
List<Integer> l=new ArrayList<>();
//5.1 Find Index Value
l.add(10);
l.add(20);
l.add(30);
l.add(90);

System.out.println(l);
int i = l.indexOf(10);
System.out.println(i);

}
}
