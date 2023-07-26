package com.nt;

import java.util.Arrays;

public class FingHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {10,45,36,75,15,85,96,99};
		Integer collect = Arrays.stream(num).boxed().sorted().skip(1).findFirst().get();
		System.out.println(collect);
	}

}
