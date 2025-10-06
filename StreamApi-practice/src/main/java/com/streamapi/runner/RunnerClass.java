package com.streamapi.runner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerClass implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Stream<Integer> stream=Stream.of(1,2,3,4);
//		stream.forEach(System.out::println);
//		
//		IntStream stream1=IntStream.range(2, 5);
//		stream1.forEach(System.out::println);
//		
//		int[] ar=new int[] {1,2,3,4};
//		IntStream stream2=Arrays.stream(ar);
//		stream2.forEach(System.out::println);
//		
//		List<Integer> li=List.of(1,2,3);
//		Stream<Integer> stream3=li.stream();
//		stream3.forEach(System.out::println);
//		
//		li.stream().filter(ele->ele%2==0).forEach(System.out::println);
//		
//		int[] ar=new int[] {1,2,3,4,5};
//		IntStream stream5=IntStream.range(1, 10);
//		stream5.filter(ele->ele%2!=0).forEach(System.out::println);
		
//		List<Object> list=List.of("chinna",1,2,3,4);
//		list.stream().filter(ele->ele instanceof Integer).filter(ele->(int)ele%2==0).forEach(System.out::println);
//		
//		List<Student> list1=List.of(
//					new Student(1,"chinna","springboot"),
//					new Student(2,"lokesh","lifelessons")
//				);
//		
//		int ans=(int) list1.stream().filter(obj->obj.getCourse().equals("springboot")).count();
//		System.out.println("count"+ans);
//		
//		 // -------------------- map() EXAMPLE --------------------
//        // map() applies a function to EACH element of the stream and produces ONE new value.
//        // So, it's a one-to-one transformation.
//        // Here: Integer -> String (by converting number to String and appending "1").
//        list.stream()
//            .map(ele -> ele.toString() + 1)   // 10 -> "101", 20 -> "201", 30 -> "301"
//            .forEach(System.out::println);   // prints each element
//        // Output:
//        // 101
//        // 201
//        // 301
//        //
//        // 👉 Use case: transform values (e.g., object -> DTO, value -> string formatting, etc.)
//
//
//
//        // -------------------- flatMap() EXAMPLE --------------------
//        // Suppose we have a list of arrays (nested structure).
//        // List<String[]> → Each element is a String[] (array of strings).
//        List<String[]> list3 = List.of(
//                new String[] {"chinna", "lokesh"},
//                new String[] {"hussian", "local iyya"}
//        );
//
//        // If we use map() here:
//        // list3.stream().map(ar -> Arrays.stream(ar))
//        // This would give Stream<Stream<String>> (a stream of streams), which is not directly usable.
//
//        // flatMap() solves this problem:
//        // It "flattens" the multiple small streams (from arrays) into a SINGLE stream of elements.
//        list3.stream()
//             .flatMap(ar -> Arrays.stream(ar)) // flatten String[] into individual Strings
//             .forEach(System.out::println);    // print each string
        // Output:
        // chinna
        // lokesh
        // hussian
        // local iyya
        //
        // 👉 Use case: flatten nested structures (List<List<T>>, List<String[]>, etc.)
        // Example in real life: Student -> List of Courses (we want all courses in one flat list)
        
        
        List<Integer> list2=List.of(1,2,3,4,5,6,1,2,3);
//        IntStream stream1=IntStream.range(1, 11);
//        List<Integer> aftersort=list2.stream().distinct().collect(Collectors.toList());
//        aftersort.forEach(System.out::println);
        
//        list2.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //        stream1.filter(n->n%2==0).forEach(System.out::println);

        list2.stream().distinct().sorted((a,b)-> Integer.compare(a, b)).forEach(System.out::println);
        
        List<Student>liStu=List.of(
        		new Student(1,"chinna","springboot",6500),
        		new Student(2,"basha","sql",2000),
        		new Student(3,"lokesh","dsa",5000),
        		new Student(3,"lokesh","dsa",5000)
        		);
//        Optional<Integer> secodHiFeeliStu=liStu.stream().map(stu->stu.getFee()).distinct().sorted((a,b)->Integer.compare(b, a)).skip(1).findFirst();
//        System.out.print(secodHiFeeliStu.get());
        try {
//        Map<String, Integer> groupByCourse=liStu.stream().collect(Collectors.groupingBy(li->li.course));
//        System.out.println(groupByCourse);
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

}

class Student{
	int id;
	String name;
	String course;
	int fee;
	public Student(int id, String string1, String string2,int fee) {
		this.id=id;
		name=string1;
		course=string2;
		this.fee=fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
