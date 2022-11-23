package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12954

public class PracL09 {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = x + (x * i);
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL09 prac = new PracL09();

		System.out.println(prac.solution(2, 5));
	}
}
