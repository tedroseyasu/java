package com.codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {

		// ArrayList
		List<String> names = new ArrayList<>();

		// String Array

		String[] names2 = { "William", "David", "Albert", "Bob" };

		names.add("Ted");
		names.add("Alex");
		names.add("William");

		//Stream.of(names).sorted().forEach(System.out::print);
		//System.out.println();

		//Stream.of(names2).sorted().forEach(System.out::println);

		// Average of numbers
		//Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);
		//

//		for (String s:names) {
//			
//			System.out.println(s);
//		}
		/*
		 * System.out.println( IntStream .range(1,5) //.forEach(x->System.out.print(x));
		 * .sum() );
		 */
		// Stream.of for sorting, findFirst,ifPresent ...
		//Stream.of(5, 9, 2, 6, 1, 8).sorted().findFirst().ifPresent(System.out::print);
		
		
		Set<String> setData = new HashSet<String>();
		
		setData.add("Hu");
		setData.add("Al");
		setData.add("Wil");
		setData.add("Bob");
		Stream.of(setData)
		.sorted()
		.forEach(x->System.out.println(x));
		//updated for loop
	//	for(String s: setData) {
	//		System.out.println(s);
	//	}
		//Lambda function
		
		
	}

}
