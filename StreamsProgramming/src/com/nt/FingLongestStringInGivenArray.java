package com.nt;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FingLongestStringInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names= {"malleksh","satwik","kumar","sachine","kjjgnlkfjgnlkdsfn"};
		String string = Arrays.stream(names).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(string);
	}

}
