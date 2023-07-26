package com.nt;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "HellosatwikHowareyouyouwillgetagoodpackage";
		/*
		 * Stream<String> stream = Arrays.stream(s.split("")); List<String> collect =
		 * stream.distinct().collect(Collectors.toList()); System.out.println(collect);
		 */
		// [H, e, l, o, s, a, t, w, i, k, r, y, u, g, d, p, c]

		// number of character occurrence in a given string

		/*
		 * Map<String, Long> collect =
		 * Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting())); System.out.println(collect); //{a=5, c=1, d=1, e=4,
		 * g=3, H=2, i=2, k=2, l=4, o=6, p=1, r=1, s=1, t=2, u=2, w=3, y=2}
		 */
		// finding duplicates characters in a given string

		/*
		 * List<String> collect = Arrays.stream(s.split(""))
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 * .entrySet().stream().filter(st->st.getValue()>1).map(Map.Entry::getKey).
		 * collect(Collectors.toList()); System.out.println(collect);//[a, e, g, H, i,
		 * k, l, o, t, u, w, y]
		 */
		
		// unique elements
		List<String> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(st->(st.getValue()==1))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(collect);
		//[c, d, p, r, s]
		
		// first non repeated element in given map
		
		Entry<String, Long> findFirst = Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(st->(st.getValue()>1)).findFirst().get()
		;
		
		System.out.println(findFirst);
		
		
	}

}
