package labAssignment6;

import java.util.*;

public class Q1 {
public static void main(String[] args) {
	List<Integer> list1=new ArrayList<>();
	Set<Integer> set1 = new HashSet<>();
	
	//list
	System.out.println("-------add method---");
	add(list1);
	
	addAll(list1);
	System.out.println("--------list iterator----------");
	for(Integer listItem: list1) {
		System.out.println(listItem);
	}
	contains(list1);
	remove(list1);
	Object[] arrList = new Integer[size(list1)];
	arrList = list1.toArray();
	
	removeAll(list1);
	clear(list1);
	
	//set
	add(set1);
	addAll(set1);
	size(set1);
	removeAll(set1);
	clear(set1);
	contains(set1);
	
	
	
	
}
//set methods
private static void contains(Set<Integer> set) {
	System.out.println(set.contains(new Integer(2)));
	
}
private static void clear(Set<Integer> set1) {
set1.clear();
	
}

private static void removeAll(Set<Integer> set1) {
	Set<Integer> set11 = new HashSet<>();
	set11.add(34);
	set11.add(78);
	set1.removeAll(set11);
	
}

private static int size(Set<Integer> set1) {
	return set1.size();
	
}

private static void addAll(Set<Integer> set1) {
	Set<Integer> set = new HashSet<>();
	set.add(20);
	set.add(30);
	set1.addAll(set1);
	
}

private static void add(Set<Integer> set1) {
set1.add(1);
set1.add(2);
set1.add(5);
set1.add(7);
	
}

//list methods
private static void clear(List<Integer> list) {
	list.clear();
	
}
private static int size(List<Integer> list1) {
	return list1.size();
	
}
private static void removeAll(List<Integer> list) {
	List<Integer> list1 = new ArrayList<>();
	list1.add(20);
	list1.add(10);
	list.removeAll(list1);
	
}
private static boolean remove(List<Integer> list1) {
	return list1.remove(new Integer(10));
	
}

private static void addAll(List<Integer> list1) {
	List<Integer> list2 = new ArrayList<>();
	list1.add(20);
	list1.add(30);
	list1.addAll(list1);
}

private static void add(List<Integer> list1) {	
	list1.add(1);
	list1.add(2);
	list1.add(4);
	list1.add(8);
	
}
private static void contains(List<Integer> list) {
	System.out.println(list.contains(10));
	
}





}

