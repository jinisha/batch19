package com.jrout.tutorial.core.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsExampleOne {

	public static void main(String[] args) {
		/*String [] names = {"name11","name22","name33"};
		System.out.println(names[0]);
		names[0] = "name111";
		System.out.println(names[0]);
		System.out.println(names.length);
		*/
//		arrayList();
//		setExample();
//		treeSetExample();
//		mapExample();
		testing();
		
	}
	public static void arrayList() {
		List names = new LinkedList();
		names.add("name1");
		names.add("name3");
		names.add("name3");
		names.add("name4");
		names.add("name5");
		System.out.println(names);
		names.add(1,"name2");
		System.out.println(names);
		
		/*System.out.println(names.size());
		System.out.println(names.get(1));
		
		System.out.println(names.size());
		
		System.out.println(names);*/
		
		// How to Iterate
		/*List<Mouse> mouses = new ArrayList<Mouse>();
		mouses.add(new Mouse("Black","Logistic"));
		mouses.add(new Mouse("White","Apple"));
//		mouses.add("Hello");
		
		for(Mouse mo : mouses) {
			System.out.println(mo.getBrand() +" " + mo.getColor());
		}
		
		for(int i = 0 ; i < mouses.size(); i++) {
			Object obj = mouses.get(i);
			
			if(obj instanceof Mouse){
				Mouse mou = (Mouse)mouses.get(i);
//				System.out.println("Mouse = " + mouses.get(i));
				System.out.println(mou.getBrand()+" "+ mou.getColor());	
			}else {
				System.out.println(obj);
			}
		}*/
	}
	
	public static void vectorExample() {
		Vector vec = new Vector();
		vec.add("name1");
		vec.add("name2");
		vec.add("name3");
	}
	
	public static void setExample() {
		Set<String> names = new HashSet<String>();
		names.add("Apple");
//		names.add("name1");
		names.add("Banaa");
		names.add("Ant");
		names.add("Pen");
		
		for(String name: names) {
			System.out.println(name);
		}
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(names);
	}
	
	public static void treeSetExample() {
		Set<String> names = new TreeSet<String>();
		names.add("Banaa");
		names.add("Apple");
		names.add("Apple");
		names.add("Ant");
		names.add("Pen");
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String nam = iter.next();
			if("Apple".equals(nam)) {
				iter.remove();
			}
		}
		
		System.out.println(names);
	}
	
	public static void mapExample() {
		List<String> jaymusic = new ArrayList();
		jaymusic.add("Classic");
		jaymusic.add("Disco");
		
		List<Mouse> jaymouse = new ArrayList<Mouse>();
		jaymouse.add(new Mouse("Black","Logistic"));
		jaymouse.add(new Mouse("White","Apple"));
		
		Map jayMap = new HashMap();
		jayMap.put("music", jaymusic);
		jayMap.put("mouse", jaymouse);
//		jayMap.put("student", new ArrayList());
		
		Iterator iter = jayMap.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)iter.next();
			System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
		}
//		System.out.println(map.get("mouse"));
	}
	
	public static void testing(){
		// student1 , student2
		List<String> stud1Courses1234 = new ArrayList<String>();
		stud1Courses1234.add("Java");
		stud1Courses1234.add(".net");
		stud1Courses1234.add("WebService");
		
		List<String> stud2Courses4444 = new ArrayList<String>();
		stud2Courses4444.add("C++");
		stud2Courses4444.add("C");
		stud2Courses4444.add("Spring");
		
		Map<String,List> studentMap = new HashMap<String,List>();
		studentMap.put("1234",stud1Courses1234);
		studentMap.put("4444",stud2Courses4444);
		studentMap.put(null,null);
		
		// Diff. between HashMap and HashTable
	}	
	
}
