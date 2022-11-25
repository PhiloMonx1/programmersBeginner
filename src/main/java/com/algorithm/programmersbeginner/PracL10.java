package com.algorithm.programmersbeginner;

import java.util.Arrays;
import java.util.Comparator;

//https://school.programmers.co.kr/learn/courses/30/lessons/12933

public class PracL10 {
	public long solution(long n) {
		String s = n + "";
		String answer = "";
		String[] ar = s.split("");

		Arrays.sort(ar, Comparator.reverseOrder());

		for (String s1 : ar) {
			answer += s1;
		}

		return Long.parseLong(answer);
	}

	public static void main(String[] args) {
		PracL10 prac = new PracL10();

		System.out.println(prac.solution(118372));
	}
}
