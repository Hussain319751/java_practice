package com.nit.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeCollectoinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeCollectoinsApplication.class, args);
		try {
//		TreeSet<Integer> set=new TreeSet<Integer>();
//		set.add(null);	
//		System.out.println(set);  //output-> []
			
		
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		List<Integer> list1=new CopyOnWriteArrayList<>(list);
		System.out.println(list1);
		for (Integer i : list1) {
		    if (i == 2) {
		        list1.remove(i);
		        list1.add(4);
		    }
		}
		System.out.println(list1);
		
//		li.add(4);   output->java.lang.UnsupportedOperationException
//		System.out.println(li);
			
//		List<Integer> li1=Collections.unmodifiableList(li);
//		li1.add(null);
//		li1.add(null);
		
//		List<Integer> ans=li.subList(0, 1);
//		System.out.println(ans);
//		
//		ans.set(0, 10);     outpu->10,2,3(modifies)
//		System.out.println(li);
		
		
//		for(int num: li1) {
//			li1.add(1);                  concurrentmodificationexception
//		}
//		System.out.println(li1);
		
//		List<Integer> li2=Collections.unmodifiableList(li);
//		li2.add(2);                    output->java.lang.UnsupportedOperationException
//		System.out.println(li2);
		
//			class A{
//				 static public void prin() {
//					System.out.println("in a");
//				}
//			}
//			
//			class B extends A{
//				static public void prin() {
//					
//				}
//			}
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}
