package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindelementinArraywhostartswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {10,45,36,75,15,85,96,99};

		List<String> collect = Arrays.stream(num)
				.sorted()
				.boxed()
				.map(s->s+"")
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("---------------------------------------------------");
		
		//string join method
		
		String[] num1= {"10","45","36","75","15","85","96","99"};
		List<String> asList = Arrays.asList(num1);
		
		String join = String.join("-", asList);
		System.out.println(join);
		
	}

}
